package com.xworkz.newspaper.runner;

import com.xworkz.newspaper.app.dto.WeatherDTO;
import com.xworkz.newspaper.app.repository.WeatherRepository;
import com.xworkz.newspaper.app.repository.WeatherRepositoryImpl;
import com.xworkz.newspaper.app.service.WeatherService;
import com.xworkz.newspaper.app.service.WeatherServiceImpl;

public class WeatherRunner {

	public static void main(String[] args) {

		WeatherRepository weatherRepository = new WeatherRepositoryImpl();
		WeatherService weatherService = new WeatherServiceImpl(weatherRepository);
		WeatherDTO dto = new WeatherDTO("Hubli", 50, 70, "Hotter");
		boolean persisted = weatherService.validateAndSave(dto);
		System.out.println("Persisted : " + persisted);

	}

}
