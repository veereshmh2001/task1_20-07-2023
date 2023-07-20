class Baker{
	static void cooking(String foodItems,int noOfPeople,String workingFor,int experince,String duration,String assistance)
	{
		System.out.println("Invoking in Baker");
		System.out.println(" Food Items : " + foodItems);
		System.out.println(" Number of People : " + noOfPeople);
		System.out.println(" Working For : " + workingFor);
		System.out.println(" Experince : " + experince);
		System.out.println(" Duration : " + duration);
		System.out.println(" Assistance : " + assistance);
		
		if(foodItems!=null)
		{
			System.out.println("Food Items is Valid");
		}
		
		else{
			System.err.println("Food Items is in Valid");
		}
		
		if(noOfPeople>1  &&  noOfPeople<6)
		{
			System.out.println("  Number of People is Valid ");
		}
		else{
			System.err.println( " Number of People is in Valid ");
		}
		
		if(workingFor!=null)
		{
			System.out.println("Working For is Valid");
		}
		
		else{
			System.err.println("Working For is in Valid");
		}
		
		if(experince>1 && experince<7)
		{
			System.out.println("Experince is Valid");
		}
		
		else{
			System.err.println("Experince is in Valid");
		}
		
		if(duration!=null)
		{
			System.out.println("Duration is Valid");
		}
		
		else{
			System.err.println("Duration is in Valid");
		}
		
		if(assistance!=null)
		{
			System.out.println("Assistance is Valid");
		}
		
		else{
			System.err.println("Assistance is in Valid");
		}
	}
}