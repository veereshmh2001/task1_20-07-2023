package com.xworkz.boot.equals;

import com.xworkz.app.equals.Minister;

public class MinisterHead {

	public static void main(String[] args) {
		System.out.println("invoking main in minister");

		Minister minister = new Minister("siddu",50,"Finance", "BJP Party", 3, true);
		Minister minister2 = new Minister("siddu",50,"Health", "AAP Party", 2, false);
		System.out.println(minister);

		boolean same = minister.equals(minister2);
		System.out.println("minister1 and minister2 are same" + same);

	}

}
