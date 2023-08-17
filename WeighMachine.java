class WeighMachine{
	static void kg(int capacity, String brand, String unit)
	{
		System.out.println("Invoking in Weigh Machine");
        System.out.println("Capacity: " + capacity);
        System.out.println("Brand: " + brand);
        System.out.println("Unit: " + unit);
		
		if(capacity>100 && capacity<10000)
		{
			System.out.println("  Capacity is Valid ");
		}
		else{
			System.err.println( " Capacity is in Valid ");
		}
		
		if(brand!=null)
		{
			System.out.println("  Brand is Valid ");
		}
		else{
			System.err.println( " Brand is in Valid ");
		}
		
		if(unit!=null)
		{
			System.out.println("Unit is Valid");
		}
		
		else{
			System.err.println("Unit is in Valid");
		}
	}
} 