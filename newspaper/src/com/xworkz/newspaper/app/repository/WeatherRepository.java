package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.WeatherDTO;

public interface WeatherRepository {
	
	int TOTAL_ITEMS=9;
	void store(WeatherDTO dto);

}
