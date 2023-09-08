package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.WeatherDTO;
import com.xworkz.newspaper.app.repository.WeatherRepository;

public class WeatherServiceImpl implements WeatherService {

	private WeatherRepository weatherRepository;

	public WeatherServiceImpl(WeatherRepository weatherRepository) {
		this.weatherRepository = weatherRepository;
	}

	@Override
	public boolean validateAndSave(WeatherDTO dto) {
		System.out.println("invoking validate and save in newspaper service Impl");
		if (dto != null) {
			System.out.println("dto is valid " + this.getClass().getSimpleName());
			String location = dto.getLocation();
			double temperature = dto.getTemperature();
			double humidity = dto.getHumidity();
			String condition = dto.getCondition();
			if (location != null && !location.isEmpty() && location.length() >= 5 && location.length() <= 20) {
				System.out.println("location is valid");

			} else {
				System.err.println("location is not valid");
			}

			if (temperature > 0 && humidity > 0) {
				System.out.println("temperature & humidity are valid");
			} else {
				System.err.println("temperature & humidity are invalid");
			}
			if (condition != null && !condition.isEmpty() && condition.length() >= 5 && condition.length() <= 20) {
				System.out.println("condition is valid");

			} else {
				System.err.println("condition is not valid");
			}
			this.weatherRepository.store(dto);
			return true;
		} else {
			System.err.println("dto is invalid");
		}

		return false;
	}

}
