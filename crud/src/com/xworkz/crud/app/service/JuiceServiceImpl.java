package com.xworkz.crud.app.service;

import com.xworkz.crud.app.reopsitory.JuiceRepository;

public class JuiceServiceImpl implements JuiceService {
	private JuiceRepository juiceRepository;

	public JuiceServiceImpl(JuiceRepository juiceRepository) {
		this.juiceRepository = juiceRepository;
	}

	@Override
	public boolean validateAndSave(String juice) {
		System.out.println("invoking validateandsave " + this.getClass().getSimpleName());
		if (juice != null && !juice.isEmpty() && juice.length() >= 3 && juice.length() < 9) {
			System.out.println("It is valid");
			if (!this.juiceRepository.isExist(juice)) {
				this.juiceRepository.store(juice);
				return true;
			} else {
				System.err.println("Juice " + juice + "already exist");
			}

		}

		else {
			System.err.println("It is invalid");
		}
		return false;
	}

}
