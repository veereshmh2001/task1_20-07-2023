package com.xworkz.singerSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ClickController {

	public ClickController() {
		System.out.println("created ClickController");
	}

	@RequestMapping(value = "/song", method = RequestMethod.POST)
	public String onClick() {
		System.out.println("OnClick.....");

		return "index";

	}

}