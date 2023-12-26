package com.xworkz.cakeOrderSpring.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@RequestMapping("/")
public class ClickComponent {
	
	public ClickComponent() {
		// TODO Auto-generated constructor stub
		System.out.println("Created ClickComponent");
	}
	
	@RequestMapping(value = "/cakes", method = RequestMethod.POST)
	public String onClick() {
		System.out.println("OnClick ..........");

		return "index.jsp";
	}

}
