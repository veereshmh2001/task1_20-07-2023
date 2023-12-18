package com.xworkz.automobile;

import java.util.List;

import com.xworkz.automobile.dto.Vehicle;

public interface AutomobileRepo {
	
	public void saveVehicleDetails(Vehicle vehicle);
	
	public void saveVehicleDetails(List<Vehicle> vehicle);
	
	public void updateVehicleDetails(Vehicle vehicle);
	
	public void updateVehicleDetails(List<Vehicle> vehicle);
	
	public List<Vehicle> fetchAllVehicles();
	
	public void deleteVehicleByName(String name);

}
