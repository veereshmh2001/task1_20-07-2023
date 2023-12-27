package com.xworkz.scientistSpring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.scientistSpring.dto.ScientistDTO;
import com.xworkz.scientistSpring.service.ScientistService;

@Controller
@RequestMapping("/")
public class ScientistController {
	@Autowired
	private ScientistService scientistService;

	public ScientistController() {
		System.out.println("Created ScientistController");
	}

	@PostMapping("/award")
	public String save(@Valid ScientistDTO dto, BindingResult errors, Model model) {
		System.out.println("Invoking learn().....");

		System.out.println("Is ScientistDTO is valid :" + errors.hasErrors());

		if (errors.hasErrors()) {
			model.addAttribute("dto", dto);

			List<ObjectError> objectErrors = errors.getAllErrors();
			objectErrors.forEach(e -> System.err.println(e.getObjectName() + ":message " + e.getDefaultMessage()));
			model.addAttribute("errors", objectErrors);
			return "scientists";
		} else {
			boolean saved = this.scientistService.validateAndSave(dto);
			if (saved) {
				System.out.println("ScientistDTO:" + dto);
				model.addAttribute("msg", "Scientist details sent successfully");
			} else {
				model.addAttribute("msg", "Scientist details  not sent successfully");
			}
			return "success";
		}

	}
}
