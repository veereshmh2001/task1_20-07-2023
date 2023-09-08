package com.xworkz.crud.app.service;

public interface JuiceService {
	
	 default boolean validateAndSave(String juice) {
		return false;
	}

}
