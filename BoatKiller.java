class BoatKiller{
	
	public static void main(String[] values){
		
		System.out.println("invoking main method in BoatKiller");
		
		Boat boat=new Boat();
		System.out.println("Boat: Type in main method " +boat.type);
		System.out.println("Boat: Fuel in main method " +boat.fuel);
		System.out.println("Boat: No Of Passenger in main method " +boat.noOfPassenger);
		
		Boat boat1=new Boat("Goods", "Disel", 250);
		System.out.println("Boat: Engine type in main method " +boat1.type);
		System.out.println("Boat: Fuel in main method " +boat1.fuel);
		System.out.println("Boat: No Of Passenger in main method " +boat1.noOfPassenger);
	}
}	