package com.xworkz.crud.app.service;

import com.xworkz.crud.app.reopsitory.CountryRepository;

public class CountryServiceImpl implements CountryService {

	private CountryRepository countryRepository;

	public CountryServiceImpl(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	@Override
	public boolean validateAndSave(String countryName) {
		System.out.println("invoking validateAndSave " + this.getClass().getSimpleName());
		if (countryName != null && !countryName.isEmpty() && countryName.length() >= 3 && countryName.length() <= 9) {
			System.out.println("Country Name is valid");

			if (!this.countryRepository.isExist(countryName)) {
				this.countryRepository.store(countryName);
				return true;
			} else {
				System.err.println("Country Name " + countryName + "already Exist");
			}

		} else {
			System.err.println("Not valid");
		}

		return false;
	}

}
