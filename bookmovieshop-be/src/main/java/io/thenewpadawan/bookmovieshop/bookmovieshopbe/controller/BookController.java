package io.thenewpadawan.bookmovieshop.bookmovieshopbe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.thenewpadawan.bookmovieshop.bookmovieshopbe.dto.BookDTO;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.service.BookService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://127.0.0.1:4200"})
@RequestMapping(value = "/books")
public class BookController {
	private final BookService bookService;
	//private final BookService bookServiceNaga;

	@Autowired
	public BookController(
			@Qualifier(value = "bookservicedefault") BookService bookService
			//@Qualifier(value = "nagabookservice") BookService bookServiceNaga
			) {
		this.bookService = bookService;
		//this.bookServiceNaga = bookServiceNaga;
	}

	@GetMapping(path = "/test")
	public ResponseEntity<String> test() {
		return new ResponseEntity<>(
				bookService.test(),
				HttpStatus.I_AM_A_TEAPOT);
	}

//	@GetMapping(path = "/nagatest")
//	public ResponseEntity<String> nagaTest() {
//		return new ResponseEntity<String>(
//				bookServiceNaga.test(),
//				HttpStatus.I_AM_A_TEAPOT);
//	}
	
	@PostMapping(path = "/new")
	public ResponseEntity<Void> create(@RequestBody BookDTO book) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
