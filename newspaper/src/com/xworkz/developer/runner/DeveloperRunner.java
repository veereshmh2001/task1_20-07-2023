package com.xworkz.developer.runner;

import com.xworkz.developer.app.dto.DeveloperDTO;
import com.xworkz.developer.app.repository.DeveloperRepository;
import com.xworkz.developer.app.repository.DeveloperRepositoryImpl;
import com.xworkz.developer.app.service.DeveloperService;
import com.xworkz.developer.app.service.DeveloperServiceImpl;

public class DeveloperRunner {

	public static void main(String[] args) {

		DeveloperRepository ref = new DeveloperRepositoryImpl();
		DeveloperService ref1 = new DeveloperServiceImpl(ref);
		DeveloperDTO ref2 = new DeveloperDTO("ram", 45, 60, "1234", "ram", true);
		DeveloperDTO ref3 = new DeveloperDTO("ram", 45, 60, "1234", "ram", true);
		ref1.validateAndSave(ref2);
		ref1.validateAndSave(ref3);
		System.out.println(args.length);

	}

}
