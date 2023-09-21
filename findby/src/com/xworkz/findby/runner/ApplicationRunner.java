package com.xworkz.findby.runner;

import com.xworkz.findby.app.dto.ApplicationDTO;
import com.xworkz.findby.app.repository.ApplicationRepository;
import com.xworkz.findby.app.repository.ApplicationRepositoryImpl;
import com.xworkz.findby.app.service.ApplicationService;
import com.xworkz.findby.app.service.ApplicationServiceImpl;

public class ApplicationRunner {

	public static void main(String[] args) {

		System.out.println("running main in ApplicationRunner");

		ApplicationRepository applicationRepository = new ApplicationRepositoryImpl();
		ApplicationService applicationService = new ApplicationServiceImpl(applicationRepository);

		
		ApplicationDTO dto = new ApplicationDTO(1010, "Veeru", null, null, null);
		boolean persisted = applicationService.validateAndSave(dto);
		System.out.println("Persisted : " + persisted);

		ApplicationDTO dto2 = new ApplicationDTO(1010, "Veeru", null, null, null);
		applicationService.validateAndSave(dto2);

	}

}
