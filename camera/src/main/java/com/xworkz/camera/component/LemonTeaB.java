package com.xworkz.camera.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class LemonTeaB {

	public LemonTeaB() {
		
		System.out.println("Created LemonTea");
	}

	@Bean
	public LemonTeaB lemon() {
		LemonTeaB lemon = new LemonTeaB();
		return lemon;
	}

}
