package com.xworkz.boot.equals;

import com.xworkz.app.equals.Ceo;

public class CeoRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in CeoRunner");
		
		Ceo ceo = new Ceo("Murthy", 45, "Infosys", 1000000.0, 5, true);
		Ceo ceo2 = new Ceo("Murthy", 45, "Infosys", 1200000.0, 3, false);
		System.out.println(ceo);
		
		boolean same = ceo.equals(ceo2);
		System.out.println("Ceo1 and Ceo2 are same" + same);
	}

}
