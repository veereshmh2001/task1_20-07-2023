package com.xworkz.scientistSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.scientistSpring.dto.ScientistDTO;
import com.xworkz.scientistSpring.repository.ScientistRepo;

@Service
public class ScientistServiceImpl implements ScientistService {
	@Autowired
	private ScientistRepo repo;
	

	public ScientistServiceImpl() {
		System.out.println("running ScientistServiceImpl");
	}

	@Override
	public boolean validateAndSave(ScientistDTO dto) {

		System.out.println("invoking  validateAndSave in ScientistServiceImpl");
		System.out.println("dto passes:" + dto);
		this.repo.save(dto);
		return true;
	}

}
