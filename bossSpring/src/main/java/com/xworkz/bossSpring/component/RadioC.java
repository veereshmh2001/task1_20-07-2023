package com.xworkz.bossSpring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RadioC {
	private Generator generator;
	@Autowired
	public RadioC(Generator generator) {
		// TODO Auto-generated constructor stub
		System.out.println("created radio");
		this.generator=generator;
		System.out.println("generator: " + this.generator);
	}

}
