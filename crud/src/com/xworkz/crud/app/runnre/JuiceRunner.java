package com.xworkz.crud.app.runnre;

import com.xworkz.crud.app.reopsitory.JuiceRepository;
import com.xworkz.crud.app.reopsitory.JuiceRepositoryImpl;
import com.xworkz.crud.app.service.JuiceService;
import com.xworkz.crud.app.service.JuiceServiceImpl;

public class JuiceRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in runner");
		JuiceRepository juiceRepository = new JuiceRepositoryImpl();
		
		JuiceService juiceService = new JuiceServiceImpl(juiceRepository);

		juiceService.validateAndSave("Apple");
		juiceService.validateAndSave("Apple");

	}

}
