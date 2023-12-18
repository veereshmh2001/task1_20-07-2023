package com.xworkz.taskSpring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Saloon {
	
	private Ajama ajama;
	@Autowired
	public Saloon(Ajama ajama) {
		System.out.println("Saloon...r");
		System.out.println("sallu:" + this.ajama);
		this.ajama=ajama;
	}

}
