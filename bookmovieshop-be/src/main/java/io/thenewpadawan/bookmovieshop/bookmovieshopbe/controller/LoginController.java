package io.thenewpadawan.bookmovieshop.bookmovieshopbe.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.thenewpadawan.bookmovieshop.bookmovieshopbe.dto.SignupRequestDTO;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.exception.UserAlreadyExistException;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.service.LoginService;
import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://127.0.0.1:4200"})
@RequestMapping(value = "/login")
@Slf4j
public class LoginController {
	private final LoginService loginService;
	
	public LoginController(@Qualifier(value = "loginservicedefault") LoginService loginService) {
		this.loginService = loginService;
	}
	
	@PostMapping(path = "/signup")
	public ResponseEntity<Void> signup(@RequestBody SignupRequestDTO signup)
			throws UserAlreadyExistException {
		loginService.signup(signup);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@ExceptionHandler(value = {UserAlreadyExistException.class})
	private ResponseEntity<Void> userAlreadyExist() {
		log.error("The mail address was already assigned to another user");
		return new ResponseEntity<>(HttpStatus.PRECONDITION_FAILED);
	}
}
