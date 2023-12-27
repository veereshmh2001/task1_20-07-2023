package com.xworkz.bankSpring.service;

import com.xworkz.bankSpring.dto.BankDTO;

public interface BankService {
	
	boolean validateAndSave(BankDTO dto);

}
