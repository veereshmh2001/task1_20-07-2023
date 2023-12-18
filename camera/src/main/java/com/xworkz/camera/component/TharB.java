package com.xworkz.camera.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TharB {
	public TharB() {
	System.out.println("running TharB");
	}
	
	@Bean
	public TharB thar() {
		TharB thar = new TharB();
		return thar;
	}

}
