package com.xworkz.crud.app.runnre;

import com.xworkz.crud.app.reopsitory.CountryRepository;
import com.xworkz.crud.app.reopsitory.CountryRepositoryImpl;
import com.xworkz.crud.app.service.CountryService;
import com.xworkz.crud.app.service.CountryServiceImpl;

public class CountryRunner {

	public static void main(String[] args) {
		
		System.out.println("invokin main in runner");
		
		CountryRepository countryRepository = new CountryRepositoryImpl();
		
		CountryService countryService = new CountryServiceImpl(countryRepository);
		
		
		countryService.validateAndSave("India");
		countryService.validateAndSave("India");

	}

}
