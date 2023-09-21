package com.xworkz.findby.app.repository;

import com.xworkz.findby.app.dto.EngineerDTO;


public interface EngineerRepository {
	
	int TOTAL_ITEMS=5;
	
	void save (EngineerDTO dto);
	
	default boolean isExist(EngineerDTO dto) {
		return false;
	}
	
	default EngineerDTO findbyName(String name) {
		
		
		return null;
		
	}

	EngineerDTO findbyNameAndCollegeNameAndId(String name, String collegeName, int id);
	
	
	

}
