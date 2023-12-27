package com.xworkz.scientistSpring.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Component
@RequestMapping("/")
public class SuccessController {
	
	public SuccessController() {
		// TODO Auto-generated constructor stub
		System.out.println("SuccessController....");
	}

	@RequestMapping(value = "/succ", method = RequestMethod.POST)
	public String onClick() {
		System.out.println("OnClick ..........");

		return "success";
	}

}
