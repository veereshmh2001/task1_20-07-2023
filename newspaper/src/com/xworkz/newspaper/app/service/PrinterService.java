package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.PrinterDTO;

public interface PrinterService {
	
	boolean validateAndSave(PrinterDTO dto);

}
