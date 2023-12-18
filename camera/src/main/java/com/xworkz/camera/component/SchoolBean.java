package com.xworkz.camera.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchoolBean {
	public SchoolBean() {
		// TODO Auto-generated constructor stub
		System.out.println("running School Bean");

	}
	@Bean
	public SchoolBean bean() {
		SchoolBean school = new SchoolBean();
		return school;
	}
}
