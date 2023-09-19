package io.thenewpadawan.bookmovieshop.bookmovieshopbe.mapper;

import org.mapstruct.Mapper;

import io.thenewpadawan.bookmovieshop.bookmovieshopbe.dto.BookDTO;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.entity.BookEntity;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.model.Book;

@Mapper(componentModel = "spring") //quello tra parentesi rende il mapper generato un component Spring. quindi posso injectare
public interface BookMapper {
	// dto -> model 1->2
	Book model(BookDTO dto);
	
	// model -> entity 2->3
	BookEntity entity(Book model);
	
	// entity -> model 4->5
	Book model(BookEntity entity);
	
	// model -> dto 5->6
	BookDTO dto(Book model);
	
	// dto -> entity 1->3
	default BookEntity entity(BookDTO dto) {
		return entity(model(dto));
	}
	
	// dto -> model 4->6
	default BookDTO dto(BookEntity entity) {
		return dto(model(entity));
	}
}
/*
  FE		BE			DB
  1
			2
						3
						4
			5
  6

map 1->2
map 2->3
map 4->5
map 5->6
BONUS:
map 1->3
map 4->6
*/