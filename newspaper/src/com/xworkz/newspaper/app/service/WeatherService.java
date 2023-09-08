package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.WeatherDTO;

public interface WeatherService {
	
	boolean validateAndSave(WeatherDTO dto);

}
