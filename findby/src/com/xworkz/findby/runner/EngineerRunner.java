package com.xworkz.findby.runner;

import com.xworkz.findby.app.dto.EngineerDTO;
import com.xworkz.findby.app.repository.EngineerRepository;
import com.xworkz.findby.app.repository.EngineerRepositoryImpl;
import com.xworkz.findby.app.service.EngineerService;
import com.xworkz.findby.app.service.EngineerServiceImpl;


public class EngineerRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking main in runner");
		
		EngineerRepository engineerRepository=new EngineerRepositoryImpl();
		EngineerService engineerService = new EngineerServiceImpl(engineerRepository);
		
		EngineerDTO dto=new EngineerDTO(100000,"Veeru", "RECcollege");
		boolean persisted = engineerService.validateAndSave(dto);
		System.out.println("Persisted : " + persisted);
		
	    EngineerDTO dto2=new EngineerDTO(100000, "Veeru", "RECcollege");
	    System.out.println("dto2 hashcode " + dto2.hashCode());

	}

}
