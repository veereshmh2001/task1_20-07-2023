package com.xworkz.bankSpring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bankSpring.dto.BankDTO;
import com.xworkz.bankSpring.service.BankService;

@Controller
@RequestMapping("/")
public class BankController {
	@Autowired
	private BankService bankService;

	public BankController() {
		System.out.println("created BankController");
	}

	@PostMapping("/created")
	public String save(@Valid BankDTO dto, BindingResult errors, Model model) {

		System.out.println("Invoking in details in BankController");
		System.out.println("Is BankDTO valid : " + errors.hasErrors());

		if (errors.hasErrors()) {
			model.addAttribute("dto", dto);

			List<ObjectError> objectError = errors.getAllErrors();
			objectError.forEach(e -> System.err.println(e.getObjectName() + ":message" + e.getDefaultMessage()));
			model.addAttribute("errors", objectError);
			return "Bank";
		} else {

			boolean saved = this.bankService.validateAndSave(dto);
			if (saved) {
				System.out.println("BankDTO : " + dto);
				model.addAttribute("msg", "Bank details sent successfully");
			} else {
				model.addAttribute("msg", "Bank details not sent successfully");
			}
			return "success";
		}

	}

}
