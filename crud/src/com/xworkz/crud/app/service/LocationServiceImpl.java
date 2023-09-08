package com.xworkz.crud.app.service;

import com.xworkz.crud.app.reopsitory.LocationRepository;

public class LocationServiceImpl implements LocationService {

	private LocationRepository locationRepository;

	public LocationServiceImpl(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}

	@Override
	public boolean validateAndSave(String area) {
		System.out.println("invoking validateAndSave " + this.getClass().getSimpleName());
		if (area != null && !area.isEmpty() && area.length() >= 3 && area.length() <= 9) {
			System.out.println("Country Name is valid");

			if (!this.locationRepository.isExist(area)) {
				this.locationRepository.place(area);
				return true;
			} else {
				System.err.println("Country Name " + area + "already Exist");
			}

		} else {
			System.err.println("Not valid");
		}

		return false;
	}

}
