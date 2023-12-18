package com.xworkz.springWebApplication.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springWebApplication")
public class BeanConfiguration {
	public BeanConfiguration() {
		// TODO Auto-generated constructor stub
		System.out.println("Created BeanConfiguration");
	}

}
