package io.thenewpadawan.bookmovieshop.bookmovieshopbe.service.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import io.thenewpadawan.bookmovieshop.bookmovieshopbe.dto.LoginRequestDTO;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.entity.UserEntity;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.mapper.UserMapper;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.repository.UserRepository;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.service.LoginService;
import lombok.extern.slf4j.Slf4j;

@Service
@Qualifier(value = "loginservicedefault")
@Slf4j
public class LoginServiceImpl implements LoginService {
	private final PasswordEncoder passwordEncoder;
//	@Value("${application.security.salt}") private String salt;
	private final String pepper;
	private final UserMapper userMapper;
	private final UserRepository userRepository;
	
	@Autowired
	public LoginServiceImpl(
			PasswordEncoder passwordEncoder,
			@Value("${application.security.pepper}") String pepper,
			UserMapper userMapper,
			UserRepository userRepository) {
		this.passwordEncoder = passwordEncoder;
		this.pepper = pepper;
		this.userMapper = userMapper;
		this.userRepository = userRepository;
	}
	
	@Override
	public void signIn(LoginRequestDTO loginRequest) {
		log.info("Inizio login con dati: {}", loginRequest);
		String oldPassword = loginRequest.getPassword();
		String passwordWithPepper = "";
//		passwordWithSaltAndPepper += Objects.hash(salt, loginRequest.getEmail());
		passwordWithPepper += oldPassword;
		passwordWithPepper += pepper;
		loginRequest.setPassword(passwordEncoder.encode(passwordWithPepper));
		UserEntity userEntity = userMapper.entity(loginRequest);
		
		// TODO registrazione utente
		log.info("Fine login con password: {}, email: {}, encryptedPassword: {}",
				oldPassword,
				loginRequest.getEmail(),
				passwordWithPepper);
	}
	
	

}
