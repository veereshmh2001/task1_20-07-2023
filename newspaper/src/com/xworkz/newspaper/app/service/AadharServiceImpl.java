package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.AadharDTO;
import com.xworkz.newspaper.app.repository.AadharRepository;

public class AadharServiceImpl implements AadharService {

	private AadharRepository aadharRepository;

	public AadharServiceImpl(AadharRepository aadharRepository) {
		this.aadharRepository = aadharRepository;
	}

	@Override
	public boolean validateAndSave(AadharDTO dto) {
		System.out.println("invoking validate and save in aadhar service Impl");
		if (dto != null) {
			System.out.println("dto is valid " + this.getClass().getSimpleName());
			String name = dto.getName();
			int number = dto.getNumber();
			String state = dto.getState();
			String sex = dto.getSex();
			if (name != null && !name.isEmpty() && name.length() >= 5 && name.length() <= 20) {
				System.out.println("Name is valid");
			} else {
				System.err.println("Name is invalid");
			}
			if (number > 0) {
				System.out.println("number is valid");
			} else {
				System.err.println("number is invalid");
			}

			if (state != null && !state.isEmpty() && state.length() >= 5 && state.length() <= 20) {
				System.out.println("state is valid");
			} else {
				System.err.println("state is invalid");
			}
			if (sex != null && !sex.isEmpty() && sex.length() >= 2 && sex.length() <= 20) {
				System.out.println("sex is valid");
			} else {
				System.err.println("sex is invalid");
			}

		}

		return false;
	}

}
