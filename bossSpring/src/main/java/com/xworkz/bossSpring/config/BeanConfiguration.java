package com.xworkz.bossSpring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.bossSpring.component.Bottle;
import com.xworkz.bossSpring.component.Bulb;
import com.xworkz.bossSpring.component.Elevator;
import com.xworkz.bossSpring.component.Generator;
import com.xworkz.bossSpring.component.Perfume;

@Configuration
@ComponentScan("com.xworkz.bossSpring")
public class BeanConfiguration {
	public BeanConfiguration() {
		// TODO Auto-generated constructor stub
		System.out.println("Created Bean");
	}
	@Bean
	public Bottle bottles() {
		Bottle ref = new Bottle();
		return ref;
	}
	@Bean
	public Bulb bulbs() {
		Bulb ref = new Bulb();
		return ref;
	}
	@Bean
	public Perfume perfumes() {
		Perfume ref = new Perfume();
		return ref;
	}

	@Bean
	public Elevator elevators(Perfume perfume) {
		Elevator ref =new Elevator(perfume);
		return ref;
	}
	@Bean
	public Generator generators() {
		Generator ref = new Generator();
		return ref;
	}


}
