class Fabric{
	
	static int getPrice(String fabric)
	{
		System.out.println("Invoking getPrice of Fabric");
		
		if(fabric!=null)
		{
			System.out.println("Fabric is valid");
			
			if("cotton"==fabric)
			{
				return 100;
			}
			
			if("nylon"==fabric)
			{
				return 120;
			}
			
			if("woolen"==fabric)
			{
				return 210;
			}
			
			if("linen"==fabric)
			{
				return 150;
			}
			
			if("polyster"==fabric)
			{
				return 190;
			}
			
			if("silk"==fabric)
			{
				return 250;
			}
		}
		else{
			System.out.println("Fabric is in valid");
		}
		return 0;
	}
}