package io.thenewpadawan.bookmovieshop.bookmovieshopbe.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import io.thenewpadawan.bookmovieshop.bookmovieshopbe.service.BookService;

@Service
@Qualifier(value = "bookservicedefault")
public class BookServiceImpl implements BookService {
	@Override
	public String test() {
		return "Test eseguito con successo";
	}
}
