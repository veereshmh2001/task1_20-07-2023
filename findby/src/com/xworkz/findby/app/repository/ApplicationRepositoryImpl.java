package com.xworkz.findby.app.repository;

import com.xworkz.findby.app.dto.ApplicationDTO;

public class ApplicationRepositoryImpl implements ApplicationRepository {

	private ApplicationDTO[] dtos = new ApplicationDTO[TOTAL_ITEMS];
	private int position;
	private ApplicationDTO dto;

	@Override
	public void save(ApplicationDTO dto) {

		System.out.println("invoking save in ApplicationRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.dtos[position] = dto;
			System.out.println(dto + " is saved at position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is full");
		}

	}

	@Override
	public boolean isExist(ApplicationDTO dto) {

		System.out.println("running is exist in " + this.getClass().getSimpleName());
		for (int index = 0; index <= this.position; index++) {
			ApplicationDTO ref = this.dtos[index];
			if (ref != null && ref.equals(dto)) {
				System.out.println("dto already exist");
				return true;
			}
		}

		return ApplicationRepository.super.isExist(dto);
	}

	@Override
	public ApplicationDTO findbyNameAndDevelopedBy(String name, String developedBy) {

		System.out.println("running findbyName arg passed " + name);
		System.out.println("current position " + this.position);
		for (int index = 0; index < this.position; index++) {
			dto = this.dtos[index];
			if (dto.getName().equals(name) && dto.getDevelopedBy().equals(developedBy)) {
				System.out.println("dto matched");
				return dto;
			}

		}
		System.err.println("No dto matched");
		return ApplicationRepository.super.findbyName(name);
	}

}
