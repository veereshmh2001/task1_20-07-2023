class PenDrive{
	
	static int getCapacityByBrand(String brand)
	{
		System.out.println("Invoking getCapacityByBrand in pendrive");
		
		if(brand!=null)// Sony
		{
			System.out.println("Brand is valid");
			
			if("Dell"==brand)
			{
				return 256;
			}
				
		}
		else{
		System.err.println("Brand is in valid");
	}
	return -1;
	}
	
}
		