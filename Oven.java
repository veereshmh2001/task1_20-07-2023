class Oven{
	
	static void hot(int temperature, int time, String cookingMode)
	{
		System.out.println("Invoking in oven");
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Time: " + time + " minutes");
        System.out.println("Cooking mode: " + cookingMode);
		
		if(temperature>20  &&  time<30)
		{
			System.out.println("  Temperature is Valid ");
		}
		else{
			System.err.println( " Temperature is in Valid ");
		}
		
		if(time>30  &&  time<60)
		{
			System.out.println("  Time is Valid ");
		}
		else{
			System.err.println( " Time is in Valid ");
		}
		
		if(cookingMode!=null)
		{
			System.out.println("Cooking mode is Valid");
		}
		
		else{
			System.err.println("Cooking mode is in Valid");
		}
	}
} 