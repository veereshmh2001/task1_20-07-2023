package com.xworkz.bossSpring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MicrowaveC {
	
	private Bulb bulb;
	private RadioC radioC;
	@Autowired
	public MicrowaveC(Bulb bulb, RadioC radioC) {
		// TODO Auto-generated constructor stub
		System.out.println("created MicrowaveC");
		this.bulb=bulb;
		this.radioC=radioC;
		
		System.out.println("Bulb:" + this.bulb);
		System.out.println("RadioC:" + this.radioC);
	}

}
