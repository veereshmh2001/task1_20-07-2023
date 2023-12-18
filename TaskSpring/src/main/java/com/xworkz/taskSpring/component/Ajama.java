package com.xworkz.taskSpring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ajama {
	
	private Scissor sci;
	@Autowired
	public Ajama(Scissor sci) {
		System.out.println("Ajama");
		System.out.println("Ajamas:" + this.sci);
		this.sci=sci;
	}

}
