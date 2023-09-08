package com.xworkz.newspaper.runner;

import com.xworkz.newspaper.app.dto.DoctorDTO;
import com.xworkz.newspaper.app.repository.DoctorRepository;
import com.xworkz.newspaper.app.repository.DoctorRepositoryImpl;
import com.xworkz.newspaper.app.service.DoctorService;
import com.xworkz.newspaper.app.service.DoctorServiceImpl;

public class DoctorRuuner {

	

	public static void main(String[] args) {
		
		System.out.println("invoking in runner");
		
		DoctorRepository doctorRepository = new DoctorRepositoryImpl();
		DoctorService doctorService = new DoctorServiceImpl(doctorRepository);
		DoctorDTO dto = new DoctorDTO("Ram", "Manipal", 10, false);
		boolean persisted = doctorService.validateAndSave(dto);
		System.out.println("Persisted : " + persisted);


	}

}
