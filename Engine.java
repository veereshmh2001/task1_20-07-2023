class Engine{
	
	static int getCCModel(String car)
	{
		System.out.println("Invoking getCCModel from Engine");
		
		if(car!=null)
		{
			System.out.println("car is valid");
			
			if("Swift" == car)
			{
				return 1000;
			}
			if("Rapid" == car)
			{
				return 1200;
			}
			if("BMW" == car)
			{
				return 1300;
			}
			if("Benz" == car)
			{
				return 1400;
			}
			if("Audi" == car)
			{
				return 2000;
			}
			if("Bently" == car)
			{
				return 3000;
			}
		}
		else
		{
				System.err.println("car is in valid");
		}
		return 0;
		}
		
	
}