package com.xworkz.crud.app.service;

public interface TrainNoService {

	default boolean validateAndSave(String trainNumber) {
		return false;
	}

}
