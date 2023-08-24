package com.xworkz.runner;

import com.xworkz.app.Military;
import com.xworkz.impl.MilitaryBase;

public class MilitaryRunner {

	public static void main(String[] args) {
		Military military = new MilitaryBase();
		military.name();
		int value=military.noOfVehicle(null);
		System.out.println(value);
		military.noOfSoldier(null);
		military.chief(0);

	}

}
