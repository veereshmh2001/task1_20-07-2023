class Umbrella{
	
	static void protect()
	{
		
		System.out.println("invoking protect umbrella");
		String from="rain";
		System.out.println(" From : " + from);
		
	}
	
	static void protect(String color)
	{
		System.out.println("invoking protect(String) umbrella");
		
		System.out.println(" color : " + color);
	}
	
	static void protect(String color, int quantity)
	{
	
	System.out.println(" color : " + color);
	System.out.println(" quantity : " + quantity);
	}
}
 