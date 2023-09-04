package com.xworkz.crud.app.impl;

import com.xworkz.crud.app.reopsitory.Patient;

public class PatientImpl implements Patient {

	private String[] patients = new String[TOTAL_PATIENTS];
	int position;

	@Override
	public void addPatient(String patientName) {

		System.out.println("Invoking addPatient in PatientImpl...");

		if (this.position < TOTAL_PATIENTS) {
			this.patients[position] = patientName;
			System.out.println("Added patient " + patientName + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("Patient storage is full, cannot add more patients...");
		}

	}

}
