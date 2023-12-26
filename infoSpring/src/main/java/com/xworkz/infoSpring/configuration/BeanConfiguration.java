package com.xworkz.infoSpring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.infoSpring")
public class BeanConfiguration {

	public BeanConfiguration() {
		// TODO Auto-generated constructor stub
		System.out.println("Created BeanConfiguration");
	}
	
	@Bean
	public ViewResolver viewResolver() {
		ViewResolver resolver = new InternalResourceViewResolver("/",".jsp");
		return resolver;
	}

}
