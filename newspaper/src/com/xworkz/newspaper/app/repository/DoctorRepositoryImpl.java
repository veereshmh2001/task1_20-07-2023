package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.DoctorDTO;

public class DoctorRepositoryImpl implements DoctorRepository {

	private DoctorDTO[] dtos = new DoctorDTO[TOTAL_DOCTORS];
	private int position;

	@Override
	public void save(DoctorDTO dto) {
		System.out.println("invoking save in DoctorRepositoryImpl");
		if (position < TOTAL_DOCTORS) {
			this.dtos[position] = dto;
			System.out.println(dto + " is saved at position " + this.position);
			this.position++;

		} else {
			System.err.println("Storage is full");
		}

	}

}
