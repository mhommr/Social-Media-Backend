package com.cooksys.social_media_demo.services.impl;

import org.springframework.stereotype.Service;

import com.cooksys.social_media_demo.dtos.UserRequestDto;
import com.cooksys.social_media_demo.entities.User;
import com.cooksys.social_media_demo.mappers.UserMapper;
import com.cooksys.social_media_demo.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl {
	
	private final UserRepository userRepository;
	private final UserMapper userMapper;

	
	
}
