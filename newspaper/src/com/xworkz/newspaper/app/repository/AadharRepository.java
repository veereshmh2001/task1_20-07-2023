package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.AadharDTO;

public interface AadharRepository {
	
	int TOTAL_ITEMS = 7;

	void save(AadharDTO dto);

}
