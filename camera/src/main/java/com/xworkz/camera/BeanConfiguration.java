package com.xworkz.camera;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.camera")
public class BeanConfiguration {
	
	public BeanConfiguration() {
		System.out.println("created BeanConfiguration");
	}

}
