package com.xworkz.scientistSpring.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@RequestMapping("/")
public class ClickController {

	public ClickController() {
		// TODO Auto-generated constructor stub
		System.out.println("ClickController....");
	}

	@RequestMapping(value = "/talent", method = RequestMethod.POST)
	public String onClick() {
		System.out.println("OnClick ..........");

		return "index";
	}

}
