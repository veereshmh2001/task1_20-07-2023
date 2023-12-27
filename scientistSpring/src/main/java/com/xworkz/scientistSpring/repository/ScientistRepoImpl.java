package com.xworkz.scientistSpring.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.scientistSpring.dto.ScientistDTO;
@Repository
public class ScientistRepoImpl implements ScientistRepo {

	@Override
	public void save(ScientistDTO dto) {
		
		System.out.println("Invoking in ScientistRepoImpl");
		System.out.println("Dto passed : " + dto);

	}

}
