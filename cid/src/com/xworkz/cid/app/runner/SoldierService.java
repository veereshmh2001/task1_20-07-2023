package com.xworkz.cid.app.runner;

import com.xworkz.cid.app.dto.SoldierDTO;


public interface SoldierService {
	
	
	public boolean validateAndSave(SoldierDTO dto);
	
	default SoldierDTO findbyworkingFor(String name) {
		
		return null;
	}

}
