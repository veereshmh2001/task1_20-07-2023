package com.xworkz.bossSpring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TileC {

	private Perfume perfume;
	
	@Autowired
	public TileC(Perfume perfume) {
		// TODO Auto-generated constructor stub
		System.out.println("created tileC");
		this.perfume = perfume;
		System.out.println("perfume:" + this.perfume);
	}

}
