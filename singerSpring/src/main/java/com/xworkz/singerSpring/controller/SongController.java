package com.xworkz.singerSpring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.singerSpring.dto.SingerDTO;

@Controller
@RequestMapping("/")
public class SongController {
	
	public SongController() {
		System.out.println("Invoking SongController");
	}
	
	@RequestMapping("/award")
	public String save(@Valid SingerDTO dto , BindingResult errors , Model model) {
		
		System.out.println("Invoking learn().....");
		System.out.println("Is SingerDTO is valid :" + errors.hasErrors());
		
		if (errors.hasErrors()) {
			model.addAttribute("dto", dto);

			List<ObjectError> objectErrors = errors.getAllErrors();
			objectErrors.forEach(e -> System.err.println(e.getObjectName() + ":message " + e.getDefaultMessage()));
			model.addAttribute("errors", objectErrors);
			return "scientists";
		}
		return null;
		
	}

}
