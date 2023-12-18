package com.xworkz.camera.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthorB {
	public AuthorB() {
		System.out.println("running AuthorB");
	}
	
	@Bean
	public AuthorB author() {
		AuthorB author = new AuthorB();
		return author;
	}
}
