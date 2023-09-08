package com.xworkz.crud.app.service;

public interface LocationService {
	
	default boolean validateAndSave(String area) {
		return false;
	}

}
