package io.thenewpadawan.bookmovieshop.bookmovieshopbe.dto;

import java.util.Date;

import lombok.Data;

@Data
public class LoginResponseDTO {
	private String email;
	private String password;
	private String address;
	private Date birhday;
	private Date registrationDate;
}
