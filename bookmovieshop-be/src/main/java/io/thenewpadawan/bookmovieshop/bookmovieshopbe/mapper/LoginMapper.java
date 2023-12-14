package io.thenewpadawan.bookmovieshop.bookmovieshopbe.mapper;

import org.mapstruct.Mapper;

import io.thenewpadawan.bookmovieshop.bookmovieshopbe.dto.LoginRequestDTO;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.dto.LoginResponseDTO;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface LoginMapper {
	// LoginRequestDTO -> UserEntity
	UserEntity entity(LoginRequestDTO dto);
	
	// UserEntity -> LoginResponseDTO
	LoginResponseDTO dto(UserEntity entity);
}
