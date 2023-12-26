package com.xworkz.infoSpring.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ClickComponent {
	public ClickComponent() {
		// TODO Auto-generated constructor stub
		System.out.println("Created Click Component");
	}
	
	

}
