package com.xworkz.camera.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookBean {

	public BookBean() {
		System.out.println("Running BookBean");
	}

	@Bean
	public BookBean book() {
		BookBean book = new BookBean();
		return book;
	}

}
