package com.xworkz.farmer.app;

public class Farmer {
	private String name;
	private Land land;

	public Farmer(String name) {
		this.name = name;

	}

	public void Farming() {
		System.out.println("invoking Farming in Farmer");
		this.land.cropGrowing();
	}

	public void setLand(Land land2) {
		this.land = land;

	}

}
