package com.java.app;

public class StringRunner {

	public static void main(String[] args) {
		
		String string = new String();
		System.out.println("charAt()");
		string = "Runner";
		char store=string.charAt(3);
		System.out.println(store);
		
		System.out.println("split()");
		String input= "A,B,C,D,E,F";
		String[] letters=input.split(",");
		for(int i=0;i<letters.length;i++) {
			System.out.println(letters[i]);
		}
		
		System.out.println("split()overloaded");
		String[]letters1=input.split("A",3);
		for(int j=0;j<letters1.length;j++) {
			System.out.println(letters[j]);
		}
		
		System.out.println("concat()");
		String car="New";
		String New=car.concat("Thar");
		System.out.println(New);
		
		System.out.println("compareTo()");
		String name="Veeru";
		int result=name.compareTo("Veeru");
		System.out.println(result);
		
		System.out.println("substring()overloaded");
		String Thar=car.substring(1,2);
		System.out.println(Thar);
		
		System.out.println("isEmpty");
		boolean res=string.isEmpty();
		System.out.println("isEmpty:"+res);
		
		System.out.println(" length() method");
		int res1=car.length();
		System.out.println("length:"+res1);
		
		System.out.println("startsWith() method");
		boolean res2=New.startsWith("Thar");
		System.out.println(res2);
		

		System.out.println(" endsWith() method");
		boolean res3=New.endsWith("Thar");
		System.out.println(res3);
		
		System.out.println("equalsIgnoreCase() method");
		boolean res4=car.equalsIgnoreCase("Thar");
		System.out.println(res4);
		
		System.out.println("equals() method");
		boolean athlet=string.equals("Runner");
		System.out.println(athlet);
		
		System.out.println(" toUpperCase() method");
		String name0="Veeru";
		String name1=name0.toUpperCase();
		System.out.println(name1);
		
		System.out.println("toLowerCase() method");
		String name2=name.toLowerCase();
		System.out.println(name2);
		
		System.out.println("isBlank() method");
		String veg="";
		boolean veg1=veg.isBlank();
		System.out.println(veg1);
		
		System.out.println("indexOf() method");
		int ref2=name.indexOf("r");
		System.out.println(ref2);
		
		System.out.println("trim() method");
		String luxury=car.trim();
		System.out.println(luxury);
	}
}