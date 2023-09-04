package com.xworkz.crud.app.runnre;

import com.xworkz.crud.app.impl.PatientImpl;
import com.xworkz.crud.app.reopsitory.Patient;

public class PatientRunner {

	public static void main(String[] args) {

		System.out.println("Invoking main in PatientRunner...");

		Patient patientRepo = new PatientImpl();
		patientRepo.addPatient("Rahul Kumar");
		patientRepo.addPatient("Priya Sharma");
		patientRepo.addPatient("Amit Singh");
		patientRepo.addPatient("Sneha Patel");
		patientRepo.addPatient("Rajesh Gupta");
		patientRepo.addPatient("Neha Verma");
		patientRepo.addPatient("Sanjay Joshi");
		patientRepo.addPatient("Pooja Trivedi");
		patientRepo.addPatient("Ankur Desai");
		patientRepo.addPatient("Kavita Mishra");
		patientRepo.addPatient("Vivek Sharma");

	}

}
