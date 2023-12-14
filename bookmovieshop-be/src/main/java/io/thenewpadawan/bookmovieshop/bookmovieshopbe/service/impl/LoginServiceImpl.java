package io.thenewpadawan.bookmovieshop.bookmovieshopbe.service.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import io.thenewpadawan.bookmovieshop.bookmovieshopbe.dto.SignupRequestDTO;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.entity.UserEntity;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.mapper.SignupMapper;
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
	private final SignupMapper signupMapper;
	private final UserRepository userRepository;
	
	@Autowired
	public LoginServiceImpl(
			PasswordEncoder passwordEncoder,
			@Value("${application.security.pepper}") String pepper,
			SignupMapper signupMapper,
			UserRepository userRepository) {
		this.passwordEncoder = passwordEncoder;
		this.pepper = pepper;
		this.signupMapper = signupMapper;
		this.userRepository = userRepository;
	}
	
	@Override
	public void signup(SignupRequestDTO signupDTO) {
		log.info("Inizio login con dati: {}", signupDTO);
		String oldPassword = signupDTO.getPassword();
		UserEntity userEntity = signupMapper.entity(signupDTO);
		userEntity.setPassword(
				passwordEncoder.encode(
						signupDTO.getPassword() + this.pepper));
		String passwordWithPepper = "";
//		passwordWithSaltAndPepper += Objects.hash(salt, loginRequest.getEmail());
		passwordWithPepper += oldPassword;
		passwordWithPepper += pepper;
		signupDTO.setPassword(passwordEncoder.encode(passwordWithPepper));
		userRepository.save(userEntity);
		log.info("Ora dovrei avere l'id: {}", userEntity.getId());
		// TODO return loginResponse
		log.info("Fine login con password: {}, email: {}, encryptedPassword: {}",
				oldPassword,
				signupDTO.getEmail(),
				passwordWithPepper);
		return;
	}
	
	

}
