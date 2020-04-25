package com.springboot.profiles.active;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfilesApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProfilesApplication.class, args);
		System.out.println("Here is the Spring boot app ");
	}

}
