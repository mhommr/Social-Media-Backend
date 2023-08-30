package com.cooksys.social_media_demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cooksys.social_media_demo.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
