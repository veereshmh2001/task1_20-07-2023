package com.xworkz.crud.app.runnre;

import com.xworkz.crud.app.reopsitory.TrainNoRepository;
import com.xworkz.crud.app.reopsitory.TrainNoRepositoryImpl;
import com.xworkz.crud.app.service.TrainNoService;
import com.xworkz.crud.app.service.TrainNoServiceImpl;

public class TrainNoRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in runner");

		TrainNoRepository trainNoRepository = new TrainNoRepositoryImpl();
		TrainNoService trainNoService = new TrainNoServiceImpl(trainNoRepository);

		trainNoService.validateAndSave("11265");
		trainNoService.validateAndSave("11267");

	}

}
