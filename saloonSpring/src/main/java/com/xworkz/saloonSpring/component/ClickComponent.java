package com.xworkz.saloonSpring.component;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@RequestMapping("/")
public class ClickComponent {

	public ClickComponent() {
		// TODO Auto-generated constructor stub
		System.out.println("created ClickComponent");
	}

	@RequestMapping(value = "/click", method = RequestMethod.POST)
	public String onClick() {
		System.out.println("OnClick ..........");

		return "index.jsp";
	}

}
