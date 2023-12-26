package com.xworkz.saloonSpring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.saloonSpring")
public class BeanConfiguration {

	public BeanConfiguration() {
		// TODO Auto-generated constructor stub
		System.out.println("Created BeanConfiguration");
	}

}
