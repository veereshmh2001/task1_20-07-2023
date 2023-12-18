package com.xworkz.camera.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OwnerB {
	public OwnerB() {
		System.out.println("running Owner Bean");
	}

	@Bean
	public OwnerB owner() {
		OwnerB owner = new OwnerB();
		return owner;
	}
}
