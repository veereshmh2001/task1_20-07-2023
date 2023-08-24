package com.xworkz.impl;

import com.xworkz.app.Military;

public class MilitaryBase implements Military {

	

	@Override
	public int noOfSoldier(String name) {
		System.out.println("invoking name in MilitaryBase");
		return 0;
	}

	@Override
	public int noOfVehicle(String company) {
		System.out.println("invoking company in MilitaryBase");
		return 0;
	}

	@Override
	public String chief(int total) {
		System.out.println("invoking total in MilitaryBase");
		return null;
	}

	@Override
	public void name() {
		System.out.println("invoking void");
		
	}

}
