package com.xworkz.camera.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnfiledB {
	public EnfiledB() {
		System.out.println("running Enfiled Bean");
	}

	@Bean
	public EnfiledB enfiled() {
		EnfiledB enfiled = new EnfiledB();
		return enfiled;
	}

}
