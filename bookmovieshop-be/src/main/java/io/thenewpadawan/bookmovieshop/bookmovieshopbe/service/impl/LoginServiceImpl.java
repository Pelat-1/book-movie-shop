package io.thenewpadawan.bookmovieshop.bookmovieshopbe.service.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import io.thenewpadawan.bookmovieshop.bookmovieshopbe.dto.LoginRequestDTO;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.service.LoginService;
import lombok.extern.slf4j.Slf4j;

@Service
@Qualifier(value = "loginservicedefault")
@Slf4j
public class LoginServiceImpl implements LoginService {
	private final PasswordEncoder passwordEncoder;
	private final String salt;
	private final String pepper;
	
	@Autowired
	public LoginServiceImpl(
			PasswordEncoder passwordEncoder,
			@Value("${application.security.salt}") String salt,
			@Value("${application.security.pepper}") String pepper) {
		this.passwordEncoder = passwordEncoder;
		this.salt = salt;
		this.pepper = pepper;
	}
	
	@Override
	public void login(LoginRequestDTO loginRequest) {
		log.info("Inizio login con dati: {}", loginRequest);
		String passwordWithSaltAndPepper = "";
		passwordWithSaltAndPepper += Objects.hash(salt, loginRequest.getEmail());
		passwordWithSaltAndPepper += loginRequest.getPassword();
		passwordWithSaltAndPepper += pepper;
		loginRequest.setPassword(passwordEncoder.encode(passwordWithSaltAndPepper));
		log.info("Fine login con password: {} e dati: {}", passwordWithSaltAndPepper, loginRequest);
	}

}
