package io.thenewpadawan.bookmovieshop.bookmovieshopbe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import io.thenewpadawan.bookmovieshop.bookmovieshopbe.dto.BookDTO;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.entity.BookEntity;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.mapper.BookMapper;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.repository.BookRepository;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.service.BookService;

@Service
@Qualifier(value = "bookservicedefault")
public class BookServiceImpl implements BookService {
	private final BookMapper bookMapper;
	private final BookRepository bookRepository;
	
	@Autowired
	public BookServiceImpl(BookMapper bookMapper, BookRepository bookRepository) {
		super();
		this.bookMapper = bookMapper;
		this.bookRepository = bookRepository;
	}

	@Override
	public String test() {
		return "Test eseguito con successo";
	}

	@Override
	public BookDTO create(BookDTO book) {
		// TODO Auto-generated method stub
		BookEntity entity = bookMapper.entity(book);
		bookRepository.save(entity);
		return bookMapper.dto(entity);
	}
}
