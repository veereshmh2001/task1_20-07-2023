package com.xworkz.taskSpring.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.taskSpring.component.Ajama;
import com.xworkz.taskSpring.component.Scissor;

@Configuration
@ComponentScan("com.xworkz.taskSpring")

public class BeanConfiguration {
	public BeanConfiguration() {
		// TODO Auto-generated constructor stub
		System.out.println("created BeanConfiguration");
	}
	@Bean
	public Scissor scissor() {
		System.out.println("Scissor");
		return new Scissor();
	}
	@Bean
	public Scissor blade() {
		System.out.println("Blade");
		return new Scissor();
	}
	@Bean
	public Ajama ajama() {
		System.out.println("Ajamaa...r");
		return new Ajama(null);
	}

}
