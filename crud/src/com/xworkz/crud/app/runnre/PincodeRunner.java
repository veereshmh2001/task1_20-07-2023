package com.xworkz.crud.app.runnre;

import com.xworkz.crud.app.reopsitory.PincodeRepository;
import com.xworkz.crud.app.reopsitory.PincodeRepositoryImpl;
import com.xworkz.crud.app.service.PincodeService;
import com.xworkz.crud.app.service.PincodeServiceImpl;

public class PincodeRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in runner");

		PincodeRepository pincodeRepository = new PincodeRepositoryImpl();
		PincodeService pincodeService = new PincodeServiceImpl(pincodeRepository);

		pincodeService.validateAndSave(580032);
		pincodeService.validateAndSave(580032);

	}

}
