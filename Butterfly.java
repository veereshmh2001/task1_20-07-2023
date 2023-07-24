class Butterfly{
	
	 static String name;
     static String color;
     int noOfButterfly;
     int totalSpecies;
	 
	 Butterfly(String name,String color)
	{
		System.out.println("invoking at static argument in Butterfly"); 
		this.name=name;
		this.color=color;
		
	}
	
	Butterfly(int noOfButterfly,int totalSpecies)
	{
		System.out.println("invoking at Instance argument in Butterfly"); 
		this.noOfButterfly=noOfButterfly;
		this.totalSpecies=totalSpecies;
	}
	
	
	static void printStatic()
	{
		
		System.out.println("invoking at static void in Butterfly"); 
		System.out.println(name);
		System.out.println(color);
	}
	
	
	
	void printInstance()
	{
		System.out.println("invoking at void Instance in Butterfly"); 
		System.out.println(noOfButterfly);
		System.out.println(totalSpecies);
	}
	
}