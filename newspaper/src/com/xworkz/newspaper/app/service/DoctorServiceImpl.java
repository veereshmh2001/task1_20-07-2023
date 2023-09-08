package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.DoctorDTO;
import com.xworkz.newspaper.app.repository.DoctorRepository;

public class DoctorServiceImpl implements DoctorService {

	private DoctorRepository doctorRepository;

	public DoctorServiceImpl(DoctorRepository doctorRepository) {
		this.doctorRepository = doctorRepository;
	}

	@Override
	public boolean validateAndSave(DoctorDTO dto) {

		System.out.println("invoking validate and save in newspaper service Impl");
		if (dto != null) {
			System.out.println("dto is valid " + this.getClass().getSimpleName());
			String name = dto.getName();
			String hospital = dto.getHospital();
			int experince = dto.getExperince();
			boolean avalaible = dto.isAvailable();
			if (name != null && !name.isEmpty() && name.length() >= 5 && name.length() <= 20) {
				System.out.println("Name is valid");
			} else {
				System.err.println("Name is invalid");
			}

			if (hospital != null && !hospital.isEmpty() && hospital.length() >= 5 && hospital.length() <= 20) {
				System.out.println("hospital is valid");
			} else {
				System.err.println("hospital is invalid");
			}
			if(experince>0) {
				System.out.println("Experince is valid");
			}
			else {
				System.err.println("Experince is invalid");
			}

		}

		return false;
	}

}
