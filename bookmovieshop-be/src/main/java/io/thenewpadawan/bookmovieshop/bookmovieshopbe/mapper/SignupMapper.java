package io.thenewpadawan.bookmovieshop.bookmovieshopbe.mapper;

import org.mapstruct.Mapper;

import io.thenewpadawan.bookmovieshop.bookmovieshopbe.dto.SignupRequestDTO;
import io.thenewpadawan.bookmovieshop.bookmovieshopbe.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface SignupMapper {
	// LoginRequestDTO -> UserEntity
	UserEntity entity(SignupRequestDTO dto);
}
