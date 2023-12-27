package com.xworkz.bankSpring.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bankSpring.dto.BankDTO;

@Repository
public class BankRepoImpl implements BankRepo {
	
	public BankRepoImpl() {
		System.out.println("Invoking in BankRepoImpl");
	}

	@Override
	public void save(BankDTO dto) {

		System.out.println("Dto Passed : " + dto);
	}

}
