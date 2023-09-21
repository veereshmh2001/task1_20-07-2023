package com.xworkz.developer.app.repository;

import com.xworkz.developer.app.dto.DeveloperDTO;

public interface DeveloperRepository {
	
	public final int TOTAL_VALUE=10;
	
	public void save(DeveloperDTO dto);
	
	public boolean isExist(DeveloperDTO dto);
	
	public DeveloperDTO findByName(String name);

}
