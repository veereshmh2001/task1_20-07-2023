class Boat{
	
	String type;
	String fuel;
	int noOfPassenger;
	
	Boat()
	{
		System.out.println("invoking no-argument of Boat");
		System.out.println("Type :" + this.type);
		System.out.println("Fuel :" + this.fuel);
		System.out.println("No Of Passenger :" + this.noOfPassenger);
		this.type="Travelling";
		this.fuel="Disel";
		this.noOfPassenger=500;
	}
	
	Boat(String type, String fuel, int noOfPassenger)
	{
		System.out.println("invoking constructor of Boat");
		System.out.println("Type :" + this.type);
		System.out.println("Fuel :" + this.fuel);
		System.out.println("No Of Passenger :" + this.noOfPassenger);
		this.type=type;
		this.fuel=fuel;
		this.noOfPassenger=noOfPassenger;
	}
}