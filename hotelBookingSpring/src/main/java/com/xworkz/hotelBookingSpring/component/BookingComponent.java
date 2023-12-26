package com.xworkz.hotelBookingSpring.component;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.hotelBookingSpring.DTO.BookingDTO;

@Component
@RequestMapping("/")
public class BookingComponent {
	public BookingComponent() {
		// TODO Auto-generated constructor stub
		System.out.println("created BookingComponent");
	}

	@PostMapping("/book")
	public String booking(@Valid BookingDTO dto, BindingResult errors) {
		System.out.println(dto);
		System.out.println("Is booking valid:"+ errors.hasErrors());
		
		List<ObjectError> objr=errors.getAllErrors();
		objr.forEach(e-> System.out.println(e.getObjectName()+ ": message " + e.getDefaultMessage()));
		
		return "booking";
	}

}
