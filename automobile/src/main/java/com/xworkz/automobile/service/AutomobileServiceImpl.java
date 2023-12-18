package com.xworkz.automobile.service;

import java.util.List;

import com.xworkz.automobile.AutomobileRepo;
import com.xworkz.automobile.AutomobileRepoImpl;
import com.xworkz.automobile.dto.Vehicle;

public class AutomobileServiceImpl implements AutomobileService {
	AutomobileRepo repo = new AutomobileRepoImpl();

	public void validateAndSave(Vehicle vehicle) {
		// TODO Auto-generated method stub

		if (vehicle.getName() != null && vehicle.getColor() != null) {
			repo.saveVehicleDetails(vehicle);
		} else {
			System.out.println("invalid details");

		}

	}

	public void validateAndSave(List<Vehicle> vehicle) {
		// TODO Auto-generated method stub

		repo.saveVehicleDetails(vehicle);

	}

	public void validateAndUpdate(Vehicle vehicle) {
		// TODO Auto-generated method stub

		if (vehicle.getName() != null && vehicle.getColor() != null) {
			repo.saveVehicleDetails(vehicle);
		} else {
			System.out.println("invalid details");

		}
	}

	public void validateAndUpdate(List<Vehicle> vehicle) {
		// TODO Auto-generated method stub

		repo.updateVehicleDetails(vehicle);

	}

	public void fetchAll() {
		// TODO Auto-generated method stub
		List<Vehicle> vehicless = repo.fetchAllVehicles();
		for (Vehicle vehicle : vehicless) {
			System.out.println(vehicle.getName());
			System.out.println(vehicle.getColor());
			System.out.println(vehicle.getType());
			System.out.println(vehicle.getModel());

		}

	}

	public void validateAndDelete(String name) {
		// TODO Auto-generated method stub
		repo.deleteVehicleByName(name);

	}
}
