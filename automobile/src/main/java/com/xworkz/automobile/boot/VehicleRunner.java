package com.xworkz.automobile.boot;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.automobile.AutomobileRepo;
import com.xworkz.automobile.AutomobileRepoImpl;
import com.xworkz.automobile.dto.Vehicle;
import com.xworkz.automobile.service.AutomobileService;
import com.xworkz.automobile.service.AutomobileServiceImpl;

public class VehicleRunner {

	public static void main(String[] args) {
		System.out.println("Running into vehicle");
		Vehicle vehicle = new Vehicle(1, "Thar", "black", "4x4", 2020);
		AutomobileRepo repos = new AutomobileRepoImpl();
		repos.saveVehicleDetails(vehicle);

		AutomobileService service = new AutomobileServiceImpl();
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(vehicle);
		service.validateAndSave(vehicles);

		Vehicle vehicle2 = new Vehicle(2, "Thar", "White", "4x4", 2222);
		AutomobileRepo repo1 = new AutomobileRepoImpl();
		repo1.saveVehicleDetails(vehicle2);

		AutomobileService ser = new AutomobileServiceImpl();
		List<Vehicle> vehiclesss = new ArrayList<Vehicle>();
		Vehicle vehicle3 = new Vehicle(3, "Thar", "red", "4x4", 2001);

		vehiclesss.add(vehicle3);
		ser.validateAndUpdate(vehicle3);

		ser.fetchAll();
		ser.validateAndDelete("Thar");
		

	}

}
