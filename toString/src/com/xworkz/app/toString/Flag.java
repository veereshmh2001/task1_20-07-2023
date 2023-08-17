package com.xworkz.app.toString;

public class Flag {
	
	private String country;
	private int year;
	private String shape;
	
	public Flag() {
		
	}
	
	
	
	public Flag(String country, int year, String shape) {
		super();
		this.country = country;
		this.year = year;
		this.shape = shape;
	}



	@Override
	public String toString() {
		
		return "Country:" + this.country + "Year:" + this.year + "Shape:" + this.shape;
	}
	
	

}
