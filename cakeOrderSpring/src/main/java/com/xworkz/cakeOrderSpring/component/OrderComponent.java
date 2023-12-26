package com.xworkz.cakeOrderSpring.component;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.cakeOrderSpring.dto.CakeDTO;

@Component
@RequestMapping("/")
public class OrderComponent {

	public OrderComponent() {
		// TODO Auto-generated constructor stub
		System.out.println("created OrderComponent");
	}

	@PostMapping("/choco")
	public String booking(@Valid CakeDTO dto, BindingResult errors, Model model) {
		System.out.println(dto);
		model.addAttribute("msg", "Order Placed Successfully");
		model.addAttribute("dto", dto);
		System.out.println("Is booking valid:" + errors.hasErrors());

		List<ObjectError> objr = errors.getAllErrors();
		objr.forEach(e -> System.out.println(e.getObjectName() + ": message " + e.getDefaultMessage()));
		model.addAttribute("errors", objr);

		return "cakeOrder";
	}

}
