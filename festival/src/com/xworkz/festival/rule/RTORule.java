package com.xworkz.festival.rule;

public interface RTORule {

	void payRoadTax();

	default String payCess() {
		System.out.println("default in payCess");
		
		return null;

	}

}
