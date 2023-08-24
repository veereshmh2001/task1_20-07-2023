package com.xworkz.impl;

import com.xworkz.app.Temple;

public class TempleVisit implements Temple {

	

	@Override
	public String templeName(int total) {
		System.out.println("invoking temple name");
		return null;
	}

	@Override
	public String location(int pincode) {
		System.out.println("invoking location");
		return null;
	}

	@Override
	public int visitors(String name) {
		System.out.println("invoking visitors");
		return 0;
	}

}
