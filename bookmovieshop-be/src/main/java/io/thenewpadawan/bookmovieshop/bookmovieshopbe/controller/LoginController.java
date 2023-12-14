package io.thenewpadawan.bookmovieshop.bookmovieshopbe.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.thenewpadawan.bookmovieshop.bookmovieshopbe.dto.SignupRequestDTO;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.service.LoginService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://127.0.0.1:4200"})
@RequestMapping(value = "/login")
public class LoginController {
	private final LoginService loginService;
	
	public LoginController(@Qualifier(value = "loginservicedefault") LoginService loginService) {
		this.loginService = loginService;
	}
	
	@PostMapping(path = "/login")
	public ResponseEntity<Void> login(@RequestBody SignupRequestDTO signup) {
		loginService.signup(signup);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
