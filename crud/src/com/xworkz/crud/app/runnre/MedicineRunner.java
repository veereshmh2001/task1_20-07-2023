package com.xworkz.crud.app.runnre;

import com.xworkz.crud.app.impl.MedicineImpl;
import com.xworkz.crud.app.reopsitory.Medicine;

public class MedicineRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in MedicineRunner...");

		Medicine repo = new MedicineImpl();
		repo.save("Aspirin");
		repo.save("Antibiotic");
		repo.save("Painkiller");
		repo.save("Cough Syrup");
		repo.save("Vitamin C");
		repo.save("Allergy Medicine");
		repo.save("Antacid");
		repo.save("Cold Medicine");
		repo.save("Insulin");
		repo.save("Antifungal");

	}

}
