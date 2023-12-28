package io.thenewpadawan.bookmovieshop.bookmovieshopbe.service;

import io.thenewpadawan.bookmovieshop.bookmovieshopbe.dto.SignupRequestDTO;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.exception.UserAlreadyExistException;

public interface LoginService {
	void signup(SignupRequestDTO signupDTO) throws UserAlreadyExistException;
}
