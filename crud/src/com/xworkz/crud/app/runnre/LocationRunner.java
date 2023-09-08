package com.xworkz.crud.app.runnre;

import com.xworkz.crud.app.reopsitory.LocationRepository;
import com.xworkz.crud.app.reopsitory.LocationRepositoryImpl;
import com.xworkz.crud.app.service.LocationService;
import com.xworkz.crud.app.service.LocationServiceImpl;

public class LocationRunner {

	public static void main(String[] args) {
		
		System.out.println("invokin main in runner");
		
		LocationRepository locationRepository = new LocationRepositoryImpl();
		LocationService locationService = new LocationServiceImpl(locationRepository);
		
		locationService.validateAndSave("Blore");
		locationService.validateAndSave("blore");

	}

}
