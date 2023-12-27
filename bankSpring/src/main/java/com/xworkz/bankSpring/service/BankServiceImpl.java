package com.xworkz.bankSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bankSpring.dto.BankDTO;
import com.xworkz.bankSpring.repository.BankRepo;

@Service
public class BankServiceImpl implements BankService {
	@Autowired
	private BankRepo bankRepo;

	public BankServiceImpl() {
		System.out.println("Invoking in BankServiceImpl");
	}

	@Override
	public boolean validateAndSave(BankDTO dto) {
		System.out.println("Running in BankServiceImpl");
		System.out.println("dto passes : " + dto);
		this.bankRepo.save(dto);
		return true;
	}

}
