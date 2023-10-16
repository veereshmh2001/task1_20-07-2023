package com.xworkz.findby.app.dto;

public class Bus {
	
	private String name;
	private int totalPassenger;
	
	
	public Bus(String name, int totalPassenger) {
		super();
		this.name = name;
		this.totalPassenger = totalPassenger;
	}


	public static void main(String[] args) {
		
		
		
		
		System.out.println("Running main in Bus");
		Bus bus=new Bus("Suguma",50);
	}

}

