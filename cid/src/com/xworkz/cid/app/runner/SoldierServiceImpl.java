package com.xworkz.cid.app.runner;

import com.xworkz.cid.app.dto.SoldierDTO;
import com.xworkz.cid.app.repository.SoldierRepository;

public class SoldierServiceImpl implements SoldierService {

	private SoldierRepository repo;

	public void SoldierRepositoryImpl(SoldierRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {

		if (dto != null) {
			String name = dto.getName();
			int age = dto.getAge();
			String rank = dto.getRank();
			String unit = dto.getUnit();
			double height = dto.getHeight();
			double weight = dto.getWeight();
			boolean isAlive = dto.isAlive();
			boolean isDeployed = dto.isDeployed();
			int yearsOfService = dto.getYearsOfService();
			String specialTraining = dto.getSpecialTraining();
			boolean T = repo.isExist(dto);
			if (T == false) {
				System.out.println("It can Store But checking the Createria");
				if (name != null && !name.isEmpty() && age != 0 && rank != null && !rank.isEmpty()
						&& yearsOfService != 0 && specialTraining != null && !specialTraining.isEmpty() && unit != null
						&& !unit.isEmpty() && height != 0 && weight != 0) {
					System.out.println("Print all conditions");
					this.repo.save(dto);
				}

				

				 else {
					System.err.println("Some Condition is missing");
				}
				
				if(!this.repo.isExist(dto)) {
					System.out.println("exist");
					this.repo.save(dto);
					return true;
				}

			} else {
				System.err.println("It is Already stored into space");
			}

		} else {
			System.err.println("It is pointing to null");
		}
		return false;

	}

	@Override
	public SoldierDTO findbyworkingFor(String name) {

		System.out.println("running in findby.....");
		if (name != null && !name.isEmpty() && name.length() >= 2 && name.length() < 20) {
			System.out.println("workingFor is valid, will find");
			SoldierDTO dto = this.repo.findByName(name);
			return dto;
		} else {
			System.err.println("workingFor is invalid...");
		}

		return SoldierService.super.findbyworkingFor(name);
	}

}
