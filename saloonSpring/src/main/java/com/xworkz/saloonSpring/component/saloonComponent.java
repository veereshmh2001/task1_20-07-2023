package com.xworkz.saloonSpring.component;



import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class saloonComponent {
	
	public saloonComponent() {
		// TODO Auto-generated constructor stub
		System.out.println("Running Saloon Component");
	}
	
	public ArrayList<Integer> numberGenerator()
	{
		ArrayList<Integer> list= new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			list.add(i);
			
		}
		return list;
		
	}
	
	@GetMapping("/saloon")
	public String generate(Model model) {
		
		model.addAttribute("number", numberGenerator());
		
		return "Saloon.jsp";
	}
	@PostMapping("/saloon")
	public String save(@RequestParam String name, @RequestParam long number) {
		System.out.println(name);
		System.out.println(number);
		
		
		return "Saloon.jsp";
	}
	
	
}
	
	
	
	
	


