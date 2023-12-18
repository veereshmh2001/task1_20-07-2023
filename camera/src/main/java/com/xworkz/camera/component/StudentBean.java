package com.xworkz.camera.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentBean {
	
	public StudentBean() {
		// TODO Auto-generated constructor stub
		System.out.println("running Student Bean");
	}

	@Bean
	public StudentBean bean() {
		StudentBean bean = new StudentBean();
		return bean;
	}
}
