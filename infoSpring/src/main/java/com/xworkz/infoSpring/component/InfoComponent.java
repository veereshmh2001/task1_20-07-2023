package com.xworkz.infoSpring.component;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class InfoComponent {

	public InfoComponent() {
		// TODO Auto-generated constructor stub
		System.out.println("Running InfoComponent");
	}

	public ArrayList<Integer> numberGenerator() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			list.add(i);

		}
		return list;

	}

	@GetMapping("/info")
	public String generate(Model model) {

		model.addAttribute("number", numberGenerator());

		return "info.jsp";
	}
	@PostMapping("/info")
	public String save(@RequestParam String name,@RequestParam String age, @RequestParam String email,@RequestParam String district,@RequestParam String city,@RequestParam String state,@RequestParam String country) {
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
		System.out.println(district);
		System.out.println(city);
		System.out.println(state);
		System.out.println(country);
		
		return "info.jsp";
	}

}
