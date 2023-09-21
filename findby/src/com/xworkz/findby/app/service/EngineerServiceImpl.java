package com.xworkz.findby.app.service;

import com.xworkz.findby.app.dto.EngineerDTO;
import com.xworkz.findby.app.repository.EngineerRepository;

public class EngineerServiceImpl implements EngineerService {

	private EngineerRepository engineerRepository;

	public EngineerServiceImpl(EngineerRepository engineerRepository) {
		this.engineerRepository = engineerRepository;
	}

	@Override
	public boolean validateAndSave(EngineerDTO dto) {

		System.out.println("invoking validate and save in EngineerServiceImpl");
		if (dto != null) {
			System.out.println("dto is valid " + this.getClass().getSimpleName());
			int id = dto.getId();
			String name = dto.getName();

			String collegeName = dto.getCollegeName();

			if (name != null && !name.isEmpty() && name.length() >= 5 && name.length() <= 20) {
				System.out.println("Name is valid");

			} else {
				System.err.println("Name is not valid");
			}
			if (collegeName != null && !collegeName.isEmpty() && collegeName.length() >= 5
					&& collegeName.length() <= 20) {
				System.out.println("collegeName is valid");
			} else {
				System.err.println("collegeName is not valid");
			}

			if (id > 0) {
				System.out.println("id is valid");
			} else {
				System.err.println("id is invalid");
			}
			
			if(!this.engineerRepository.isExist(dto)) {
				System.out.println("isExist are already exist");
				this.engineerRepository.save(dto);
				return true;
			}else {
				System.err.println("not exist");
			}
			
		} else {
			System.err.println("dto is invalid");
		}

		return false;
	}

}
