package com.xworkz.developer.app.service;

import com.xworkz.developer.app.dto.DeveloperDTO;


public interface DeveloperService {
	
	
		public boolean validateAndSave(DeveloperDTO dto);
		
		default DeveloperDTO findbyworkingFor(String name) {
			return null;
		}
	

}
