package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.PrinterDTO;

public class PrinterRepositoryImpl implements PrinterRepository {

	private PrinterDTO[] dtos = new PrinterDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void store(PrinterDTO dto) {
		
		System.out.println("invoking save in PrinterRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.dtos[position] = dto;
			System.out.println(dto + " is saved at position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is full");
		}


	}

}
