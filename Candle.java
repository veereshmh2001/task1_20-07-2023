class Candle{
	
	 static String color;
     static double height;
     int burnTimeInHours;
     boolean isScented;
	 
	 Candle(String color,double height)
	{
		System.out.println("invoking at static argument in Candle"); 
		this.color=color;
		this.height=height;
		
	}
	
	Candle(int burnTimeInHours,boolean isScented)
	{
		System.out.println("invoking at Instance argument in Candle"); 
		this.burnTimeInHours=burnTimeInHours;
		this.isScented=isScented;
	}
	
	
	static void printStatic()
	{
		
		System.out.println("invoking at static void in Candle"); 
		System.out.println(color);
		System.out.println(height);
	}
	
	
	
	void printInstance()
	{
		System.out.println("invoking at void Instance in Candle"); 
		System.out.println(burnTimeInHours);
		System.out.println(isScented);
	}
	
}