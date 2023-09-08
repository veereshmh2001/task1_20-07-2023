package com.xworkz.crud.app.service;

public interface CountryService {

	default boolean validateAndSave(String countryName) {
		return false;
	}

}
