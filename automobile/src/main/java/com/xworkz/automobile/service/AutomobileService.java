package com.xworkz.automobile.service;

import java.util.List;

import com.xworkz.automobile.dto.Vehicle;

public interface AutomobileService {

	public void validateAndSave(Vehicle vehicle);
	
	public void validateAndSave(List<Vehicle> vehicle);
	
	public void validateAndUpdate(Vehicle vehicle);
	
	public void validateAndUpdate(List<Vehicle> vehicle);
	
	public void fetchAll();
	
	public void validateAndDelete(String name);

}
