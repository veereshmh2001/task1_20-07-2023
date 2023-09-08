package com.xworkz.newspaper.runner;

import com.xworkz.newspaper.app.dto.AadharDTO;
import com.xworkz.newspaper.app.repository.AadharRepository;
import com.xworkz.newspaper.app.repository.AadharRepositoryImpl;
import com.xworkz.newspaper.app.service.AadharService;
import com.xworkz.newspaper.app.service.AadharServiceImpl;

public class AadharRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in Aadhar RUNNER");

		AadharRepository aadharRepository = new AadharRepositoryImpl();
		AadharService aadharService = new AadharServiceImpl(aadharRepository);
		AadharDTO dto = new AadharDTO("Suraj",866051295, "Karnatak", "Male");
		boolean persisted = aadharService.validateAndSave(dto);
		System.out.println("Persisted : " + persisted);

	}

}
