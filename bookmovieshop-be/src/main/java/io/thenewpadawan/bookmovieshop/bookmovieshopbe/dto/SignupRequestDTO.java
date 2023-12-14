package io.thenewpadawan.bookmovieshop.bookmovieshopbe.dto;

import java.util.Date;

import lombok.Data;

@Data
public class SignupRequestDTO {
	private String email;
	private String password;
	private String address;
	private Date birthday;
	private Date registrationDate;
}
