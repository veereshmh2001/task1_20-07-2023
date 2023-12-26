package com.xworkz.infoSpring.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.infoSpring.dto.BloodGroupDto;



@Component
@RequestMapping("/")
public class BloodGroupComponent {
	
	public BloodGroupComponent() {
		// TODO Auto-generated constructor stub
		System.out.println("Created BloodGroupComponent");
	}
	@PostMapping("/blood")
	public String blood(BloodGroupDto dto) {
		System.out.println(dto);
		return "bloodBank.jsp";
	}

}
