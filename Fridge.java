class Fridge{
	
	static void store(String brand, int quantity, int price, String capacity, String installation, int rating, String type, String weight, int noOfDoors, String manufacture)
	{
		System.out.println("Invoking in Fridge");
		System.out.println(" Brand : " + brand);
		System.out.println(" Quantity : " + quantity);
		System.out.println(" Price : " + price);
		System.out.println(" Capacity : " + capacity);
		System.out.println(" Installation : " + installation);
		System.out.println(" Rating : " + rating);
		System.out.println(" Type : " + type);
		System.out.println(" Weight : " + weight);
		System.out.println(" Number of Doors : " + noOfDoors);
		System.out.println(" Manufacture : " + manufacture);
		
		if(brand!=null)
		{
			System.out.println(" Brand is Valid ");
		}
		else{
			System.err.println( "Brand is in Valid ");
		}
		
		if(quantity>1  &&  quantity<6)
		{
			System.out.println(" Quantity is Valid ");
		}
		else{
			System.err.println( "Quantity is in Valid ");
		}
		
		if(price>30000  &&  price<60000)
		{
			System.out.println(" Price is Valid ");
		}
		else{
			System.err.println( " Price is in Valid ");
		}
		
		if(capacity!=null)
		{
			System.out.println(" Capacity is Valid ");
		}
		else{
			System.err.println( "Brand is in Valid ");
		}
		
		if(installation!=null)
		{
			System.out.println(" Installation is Valid ");
		}
		else{
			System.err.println( "Installation is in Valid ");
		}
		
		if(rating>1  &&  rating<5)
		{
			System.out.println(" Rating is Valid ");
		}
		else{
			System.err.println( " Rating is in Valid ");
		}
		
		if(type!=null)
		{
			System.out.println(" Type is Valid ");
		}
		else{
			System.err.println( " Type is in Valid ");
		}
		
		if(weight!=null)
		{
			System.out.println(" Weight is Valid ");
		}
		else{
			System.err.println( " Weight is in Valid ");
		}
		
		if(noOfDoors>1  &&  noOfDoors<3)
		{
			System.out.println(" Number of Doors is Valid ");
		}
		else{
			System.err.println( " Number of Doors is in Valid ");
		}
		
		if(manufacture!=null)
		{
			System.out.println(" Manufacture is Valid ");
		}
		else{
			System.err.println( " Manufacture is in Valid ");
		}
	}
}
		
		
	