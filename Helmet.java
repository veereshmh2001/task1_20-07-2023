class Helmet{
	
	static String logo;
	static String type;
	int noOfPieces;
	String color;
	
	Helmet(String logo,String type, int noOfPieces,String color)
	{
		System.out.println("invoking at argument in helmet"); 
		this.logo=logo;
		this.type=type;
		this.noOfPieces=noOfPieces;
		this.color=color;
	}
	
	
	static{
		logo="ISI";
		type="Full Face";
		System.out.println("invoking at static in helmet"); 
	}
	
	static void printStatic()
	{
		
		System.out.println("invoking at static void in helmet"); 
		System.out.println(logo);
		System.out.println(type);
	}
	
	
	
	void printInstance()
	{
		System.out.println("invoking at void Instance in helmet"); 
		System.out.println(noOfPieces);
		System.out.println(color);
	}
	
}