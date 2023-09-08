package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.PrinterDTO;
import com.xworkz.newspaper.app.repository.PrinterRepository;

public class PrinterServiceImpl implements PrinterService {

	private PrinterRepository printerRepository;

	public PrinterServiceImpl(PrinterRepository printerRepository) {
		this.printerRepository = printerRepository;
	}

	@Override
	public boolean validateAndSave(PrinterDTO dto) {
		System.out.println("invoking validate and save in newspaper service Impl");
		if (dto != null) {
			System.out.println("dto is valid " + this.getClass().getSimpleName());
			String brand = dto.getBrand();
			double price = dto.getPrice();
			int warranty = dto.getWarranty();
			boolean color = dto.isColorPrint();
			if (brand != null && !brand.isEmpty() && brand.length() >= 5 && brand.length() <= 20) {
				System.out.println("Name is valid");

			} else {
				System.err.println("Name is not valid");
			}

			if (price > 0 && warranty > 0) {
				System.out.println("price & warranty are valid");
			} else {
				System.err.println("price & warranty are invalid");
			}
			this.printerRepository.store(dto);
			return true;
		} else {
			System.err.println("dto is invalid");
		}

		return false;
	}

}
