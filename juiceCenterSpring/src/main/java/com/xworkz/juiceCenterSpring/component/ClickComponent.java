package com.xworkz.juiceCenterSpring.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@RequestMapping("/")
public class ClickComponent {

	public ClickComponent() {
		System.out.println("created ClickComponent");
	}

	@RequestMapping(value = "/taste", method = RequestMethod.POST)
	public String OnClick() {
		System.out.println("OnClick.....");
		return "index";
	}

}
