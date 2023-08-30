package com.cooksys.social_media_demo.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.cooksys.social_media_demo.dtos.UserRequestDto;
import com.cooksys.social_media_demo.dtos.UserResponseDto;
import com.cooksys.social_media_demo.entities.User;

@Mapper(componentModel = "spring", uses = {ProfileMapper.class, CredentialsMapper.class})
public interface UserMapper {

	User dtoToEntity(UserRequestDto userRequestDto);
	
	@Mapping(target="username", source="credentials.username")
	UserResponseDto entityToDto(User user);
	
	List<User> dtoToEntities(List<User> users);
	
}
