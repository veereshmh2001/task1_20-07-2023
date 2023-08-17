class TubelightKiller{
	
	public static void main(String[] values){
		
		System.out.println("invoking main method in TubelightKiller");
		
		Tubelight tubelight=new Tubelight();
		System.out.println("Tubelight brand in main method " +tubelight.brand);
		System.out.println("Tubelight type in main method " +tubelight.type);
		System.out.println("Tubelight length in main method " +tubelight.length);
		
		Tubelight tubelight1=new Tubelight("Syska", " Baten", 110);
		System.out.println("Tubelight brand in main method " +tubelight1.brand);
		System.out.println("Tubelight type in main method " +tubelight1.type);
		System.out.println("Tubelight length in main method " +tubelight1.length);
	}
}