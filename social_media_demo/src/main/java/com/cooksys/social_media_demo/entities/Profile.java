package com.cooksys.social_media_demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@Data
public class Profile {

	private String firstName;
	
	private String lastName;

	@Column(nullable=false, unique=true)
	private String email;
	
	private String phone;
	
}
