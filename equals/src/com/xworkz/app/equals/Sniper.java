package com.xworkz.app.equals;

public class Sniper {

	private String name;
	private int age;
	private String rifle;
	private int killCount;
	private boolean isHidden;
	private double accuracy;

	public Sniper() {

	}

	public Sniper(String name, int age, String rifle, int killCount, boolean isHidden, double accuracy) {
		super();
		this.name = name;
		this.age = age;
		this.rifle = rifle;
		this.killCount = killCount;
		this.isHidden = isHidden;
		this.accuracy = accuracy;
	}

	@Override
	public String toString() {

		return "Name : " + this.name + "," + " Age : " + this.age + "," + "Rifle : " + this.rifle + "," + "KillCount : "
				+ this.killCount + "," + "Is Hidden : " + this.isHidden + "," + "Accuracy : " + this.accuracy;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking in Sniper");

		if (obj != null) {
			System.out.println("invoking in null");
			if (obj instanceof Ceo) {
				System.out.println("invoking in instanceof ceo");
				Sniper casted = (Sniper) obj;
				Sniper currentInstance = this;
				if (currentInstance.name == casted.name && currentInstance.age == casted.age
						&& currentInstance.killCount == casted.killCount
						&& currentInstance.isHidden == casted.isHidden) {
					System.out.println("All are same");
					return true;
				} else {
					System.err.println("They are not same");
				}
			}
		} else {
			System.err.println("error in null");
		}
		return false;
	}

}
