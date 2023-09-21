package com.xworkz.developer.app.service;

import com.xworkz.developer.app.dto.DeveloperDTO;
import com.xworkz.developer.app.repository.DeveloperRepository;
import com.xworkz.newspaper.app.dto.NewsPaperDTO;

public class DeveloperServiceImpl implements DeveloperService {

	private DeveloperRepository repo;

	public DeveloperServiceImpl(DeveloperRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(DeveloperDTO dto) {

		if (dto != null) {
			String desi = dto.getDesignation();
			int exp = dto.getExperience();
			String name = dto.getName();
			double salary = dto.getSalary();
			String workingfor = dto.getWorkingFor();
			boolean diif = dto.isDifficult();
			boolean T = repo.isExist(dto);
			if (T == false) {
				System.out.println("It can Store But checking the Createria");
				if (desi != null && !desi.isEmpty() && exp != 0 && name != null && !name.isEmpty() && salary != 0
						&& workingfor != null && !workingfor.isEmpty()) {

					repo.save(dto);
				} else {
					System.err.println("Some Condition is missing");
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
	public DeveloperDTO findbyworkingFor(String name) {
		System.out.println("running in findby.....");
		if(name!=null && !name.isEmpty() && name.length()>=2 && name.length()<20) {
			System.out.println("workingFor is valid, will find");
			DeveloperDTO dto = this.repo.findByName(name);
			return dto;
		} else {
			System.err.println("workingFor is invalid...");
		}
		return DeveloperService.super.findbyworkingFor(name);
	}
	

}
