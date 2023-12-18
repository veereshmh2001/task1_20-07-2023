package com.xworkz.bossSpring.component;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;
@Configuration
public class Elevator {
	
	private Perfume perfume;
	
	@Autowired
	public Elevator(Perfume perfume) {
		// TODO Auto-generated constructor stub
		System.out.println("created Elevator");
		this.perfume=perfume;
		System.out.println("prfume:"+ this.perfume);
	}
	

}
