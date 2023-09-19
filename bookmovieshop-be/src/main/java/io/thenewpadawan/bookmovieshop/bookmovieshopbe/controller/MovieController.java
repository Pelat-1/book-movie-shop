package io.thenewpadawan.bookmovieshop.bookmovieshopbe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.thenewpadawan.bookmovieshop.bookmovieshopbe.service.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://127.0.0.1:4200"})
@RequestMapping(value = "/movies")
public class MovieController {
	@Autowired
	private MovieService movieService;

	@GetMapping(path = "/test")
	public ResponseEntity<String> test(){
		return new ResponseEntity<String>(
				movieService.test(),
				HttpStatus.ALREADY_REPORTED);
	}
}
