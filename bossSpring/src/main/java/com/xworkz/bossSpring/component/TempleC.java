package com.xworkz.bossSpring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TempleC {
	
	private Generator generator;
	private TileC tileC;
	private Elevator elevator;
	
	@Autowired
	public TempleC(Generator generator,  TileC tileC,Elevator elevator ) {
		// TODO Auto-generated constructor stub
		System.out.println("created TempleC");
		this.generator=generator;
		this.tileC=tileC;
		this.elevator=elevator;
		
		System.out.println("Generator:" + this.generator);
		System.out.println("TileC:" + this.tileC);
		System.out.println("Elevator:" + this.elevator);
	}

}
