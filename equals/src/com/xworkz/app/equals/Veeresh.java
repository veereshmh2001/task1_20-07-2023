package com.xworkz.app.equals;

public class Veeresh {

	public static void main(String[] args) {
		
		String v="veeresh";
		String newString = "";
		
		for (int i = 0; i < v.length(); i=i+2) {
			newString=newString+v.charAt(i);
		}
		System.out.println(v);
		System.out.println(newString);

	}

}
