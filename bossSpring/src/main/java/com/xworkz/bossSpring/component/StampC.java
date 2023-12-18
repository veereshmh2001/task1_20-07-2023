package com.xworkz.bossSpring.component;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class StampC {

	private Bottle bottle;

	@Autowired
	public StampC(Bottle bottle) {
		// TODO Auto-generated constructor stub
		System.out.println("created stam");
		this.bottle = bottle;
		System.out.println("Bottle : "+ this.bottle);
	}

}
