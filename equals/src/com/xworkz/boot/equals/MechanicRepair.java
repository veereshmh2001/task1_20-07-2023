package com.xworkz.boot.equals;

import com.xworkz.app.equals.Mechanic;

public class MechanicRepair {

	public static void main(String[] args) {

		System.out.println("invoking main in MechanicRepair");

		Mechanic mechanic = new Mechanic("Daas", 50, "Engine Specialist", "Bangalore", "9985896543", true);
		Mechanic mechanic2 = new Mechanic("Daas", 50, "Engine Specialist", "Bangalore", "9985896543", false);
		System.out.println(mechanic);

		boolean same = mechanic.equals(mechanic2);
		System.out.println(" Mechanic1 and Mechanic2 are same : " + same);

	}

}
