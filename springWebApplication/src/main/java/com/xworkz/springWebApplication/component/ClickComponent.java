package com.xworkz.springWebApplication.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@RequestMapping("/")
public class ClickComponent {
	public ClickComponent() {
		// TODO Auto-generated constructor stub
		System.out.println("created ClickComponent");
	}

	@RequestMapping(value = "/click", method = RequestMethod.GET)
	public String onClick(Model model) {
		System.out.println("OnClick ..........");
		model.addAttribute("Name", "Veeru");
		return "index.jsp";
	}

}
