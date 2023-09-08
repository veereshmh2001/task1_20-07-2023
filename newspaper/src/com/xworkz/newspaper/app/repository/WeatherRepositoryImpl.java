package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.WeatherDTO;

public class WeatherRepositoryImpl implements WeatherRepository {

	private WeatherDTO[] dtos = new WeatherDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void store(WeatherDTO dto) {

		System.out.println("invoking save in WeatherRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.dtos[position] = dto;
			System.out.println(dto + " is saved at position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is full");
		}

	}

}
