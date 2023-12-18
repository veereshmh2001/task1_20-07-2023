package com.xworkz.camera.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PenB {

	public PenB() {
		// TODO Auto-generated constructor stub
		System.out.println("running PenB");
	}

	@Bean
	public PenB pen() {
		PenB pen = new PenB();
		return pen;
	}

}
