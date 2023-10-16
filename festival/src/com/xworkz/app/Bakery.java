package com.xworkz.app;

public class Bakery {

	public String name = "Shantala";
	public int branches = 5;
	public char initial = 'A';
	public float price = 20F;
	public boolean available = true;
	public long mobile = 8660512953L;

	public Bakery(String name, int branches, char initial, float price, boolean available, long mobile) {
		super();
		this.name = name;
		this.branches = branches;
		this.initial = initial;
		this.price = price;
		this.available = available;
		this.mobile = mobile;
	}

	public void available() {

	}

	public static void main(String[] args) {

		boolean bakery = false;
		System.out.println("Running in Bakery");
		System.out.println("Item available :  " + bakery);
		int bakery2 = 5;
		System.out.println("Total branches :  " + bakery2);
		char bakery3 = 'A';
		System.out.println("inital :  " + bakery3);
		long bakery4 = 866051295;
		System.out.println("mobile :  " + bakery4);
		String bakery5 = "Shantala";
		System.out.println("name :  " + bakery5);

		float bakery6 = 20;
		System.out.println("price :  " + bakery6);

		Bakery bakery1 = new Bakery("Shantala", 5, 'A', 20, true, 866051295);
		bakery1.available = false;
		bakery1.branches = 5;
		bakery1.initial = 'A';
		bakery1.mobile = 866051295;
		bakery1.name = "Shantala";
		bakery1.price = 20;

	}

}
