package com.xworkz.impl;

import com.xworkz.app.Metro;

public class MetroExpress implements Metro {

	@Override
	public String city() {
		System.out.println("invoking in city");
		return null;
	}

	@Override
	public String line() {
		System.out.println("invoking in line");
		return null;
	}

	@Override
	public int stations() {
		System.out.println("invoking in ststions");
		return 0;
	}

}
