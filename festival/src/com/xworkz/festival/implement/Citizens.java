package com.xworkz.festival.implement;

import com.xworkz.festival.rule.RTORule;
import com.xworkz.festival.rule.TaxpayerRule;

public class Citizens implements RTORule, TaxpayerRule {

	@Override
	public void payRoadTax() {
		System.out.println("invoking citizen in payRoadTax");

	}

	@Override
	public void calculateTax() {
		System.out.println("invoking citizen in TaxpayerRule");

	}

	@Override
	public String payCess() {
		return RTORule.super.payCess();
	}

}
