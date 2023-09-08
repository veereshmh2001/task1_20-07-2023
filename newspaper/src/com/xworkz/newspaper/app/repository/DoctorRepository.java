package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.DoctorDTO;

public interface DoctorRepository {

	int TOTAL_DOCTORS = 7;

	void save(DoctorDTO dto);

}
