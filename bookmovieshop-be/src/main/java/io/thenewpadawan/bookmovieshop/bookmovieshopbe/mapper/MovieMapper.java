package io.thenewpadawan.bookmovieshop.bookmovieshopbe.mapper;

import org.mapstruct.Mapper;

import io.thenewpadawan.bookmovieshop.bookmovieshopbe.dto.MovieDTO;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.entity.MovieEntity;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.model.Movie;

@Mapper(componentModel = "spring") //quello tra parentesi rende il mapper generato un component Spring. quindi posso injectare
public interface MovieMapper {
	Movie model(MovieDTO dto);
	
	MovieEntity entity(Movie model);
	
	Movie model(MovieEntity entity);
	
	MovieDTO dto(Movie model);
	
	default MovieEntity entity(MovieDTO dto) {
		return entity(model(dto));
	}
	
	default MovieDTO dto(MovieEntity entity) {
		return dto(model(entity));
	}
}
