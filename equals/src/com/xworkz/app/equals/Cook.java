package com.xworkz.app.equals;

public class Cook {

	private String name;
	private int age;
	private String cuisineSpecialty;
	private String restaurantName;
	private int yearsOfExperience;
	private boolean isCertified;

	public Cook() {
		super();
	}

	public Cook(String name, int age, String cuisineSpecialty, String restaurantName, int yearsOfExperience,
			boolean isCertified) {
		super();
		this.name = name;
		this.age = age;
		this.cuisineSpecialty = cuisineSpecialty;
		this.restaurantName = restaurantName;
		this.yearsOfExperience = yearsOfExperience;
		this.isCertified = isCertified;
	}

	@Override
	public String toString() {

		return "Name : " + this.name + "," + " Age : " + this.age + "," + "Cuisine Specialty : " + this.cuisineSpecialty
				+ "," + "Restaurant Name : " + this.restaurantName + "," + "Years Of Experience : "
				+ this.yearsOfExperience + "," + "Is Certified : " + this.isCertified;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking in Cook");

		if (obj != null) {
			System.out.println("invoking in null");
			if (obj instanceof Cook) {
				System.out.println("invoking in instanceof Cook");
				Cook casted = (Cook) obj;
				Cook currentInstance = this;
				if (currentInstance.name == casted.name && currentInstance.age == casted.age
						&& currentInstance.cuisineSpecialty == casted.cuisineSpecialty
						&& currentInstance.restaurantName == casted.restaurantName
						&& currentInstance.yearsOfExperience == casted.yearsOfExperience
						&& currentInstance.isCertified == casted.isCertified) {
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
