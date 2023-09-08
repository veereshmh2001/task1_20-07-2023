package com.xworkz.newspaper.runner;

import com.xworkz.newspaper.app.dto.PrinterDTO;
import com.xworkz.newspaper.app.repository.PrinterRepository;
import com.xworkz.newspaper.app.repository.PrinterRepositoryImpl;
import com.xworkz.newspaper.app.service.PrinterService;
import com.xworkz.newspaper.app.service.PrinterServiceImpl;

public class PrinterRunner {

	public static void main(String[] args) {

		PrinterRepository printerRepository = new PrinterRepositoryImpl();
		PrinterService printerService = new PrinterServiceImpl(printerRepository);
		PrinterDTO dto = new PrinterDTO("Sony", 6000, 5, true);
		boolean persisted = printerService.validateAndSave(dto);
		System.out.println("Persisted : " + persisted);

	}

}
