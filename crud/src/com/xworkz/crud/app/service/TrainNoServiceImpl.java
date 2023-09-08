package com.xworkz.crud.app.service;

import com.xworkz.crud.app.reopsitory.TrainNoRepository;
import com.xworkz.crud.app.reopsitory.TrainNoRepositoryImpl;

public class TrainNoServiceImpl implements TrainNoService {

	TrainNoRepository trainNoRepository = new TrainNoRepositoryImpl();

	public TrainNoServiceImpl(TrainNoRepository trainNoRepository) {
		this.trainNoRepository = trainNoRepository;
	}

	@Override
	public boolean validateAndSave(String trainNumber) {
		System.out.println("invoking validateAndSave " + this.getClass().getSimpleName());
		if (trainNumber != null && !trainNumber.isEmpty() && trainNumber.length() >= 5 && trainNumber.length() <= 11) {
			System.out.println("Train Number is valid");

			if (!this.trainNoRepository.isExist(trainNumber)) {
				this.trainNoRepository.save(trainNumber);
				return true;
			} else {
				System.err.println("Country Name " + trainNumber + "already Exist");
			}

		} else {
			System.err.println("Not valid");
		}

		return false;
	}

}
