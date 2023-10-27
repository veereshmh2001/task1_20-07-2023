package com.xworkz.collections;

public class Array {

	public static void main(String[] args) {
		
		String students= "Veer";
		String boys="Royal";
		String girls="princes";
		String state="Karnataka";
		String city="Hubli";
		String district="dharwad";
		String country="india";
		
		String Arrays[]= {students,boys,girls,state,city,district,country};
		for (int List=0;List<Arrays.length;List++)
			System.out.println("Arrays " +Arrays[List]+ " is at position " +List);

		Arrays[5]="Societe Generale";
			String temp=Arrays[5];
			System.out.println("\n");


			for (int List=Arrays.length-1;List>=0;List--)
			System.out.println("Arrays " +Arrays[List]+ " is at position" +List);

	}

}
