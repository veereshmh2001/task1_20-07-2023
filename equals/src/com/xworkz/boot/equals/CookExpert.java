package com.xworkz.boot.equals;

import com.xworkz.app.equals.Cook;

public class CookExpert {
	public static void main(String[] args) {
		System.out.println("invoking main in Cook Expert");

		Cook cook = new Cook("Rohan", 20, "Russian Cuisine", "Pasta Paradise", 5, true);
		Cook cook2 = new Cook("Rohan", 20, "Russian Cuisine", "Pasta Paradise", 5, true);
		System.out.println(cook);

		boolean same = cook.equals(cook2);
		System.out.println("Cook1 and Cook2 are same : " + same);

	}

}
