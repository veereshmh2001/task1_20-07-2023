package com.xworkz.impl;

import com.xworkz.app.Engineer;

public class EngineeringCollege implements Engineer {

	@Override
	public String field() {
		System.out.println("invoking in field");
		return null;
	}

	@Override
	public int experience() {
		System.out.println("invoking in expierence");
		return 0;
	}

	@Override
	public String speciality() {
		System.out.println("invoking in speciality");
		return null;
	}

}
