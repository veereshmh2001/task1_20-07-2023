package com.xworkz.festival.boot;

import com.xworkz.festival.implement.Citizens;
import com.xworkz.festival.rule.RTORule;

public class CitizenRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in CitizenRunner ");

		RTORule ref = new Citizens();
		ref.payCess();
		ref.payRoadTax();

	}

}
