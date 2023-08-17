class Cake{
	
	static void tasty(String name,String type,String bakeryName,int price, int noOfPieces, String Occassion)
	{
		System.out.println("Invoking cake and Info");
		System.out.println(" Name : " + name);
		System.out.println(" Type : " + type);
		System.out.println(" Bakery Name : " + bakeryName);
		System.out.println(" Price : " + price);
		System.out.println(" Number of pieces : " + noOfPieces);
		System.out.println(" Occassion : " + Occassion);
		
		if(name!=null)
		{
			System.out.println("Name is Valid");
		}
		
		else{
			System.err.println("Name is in Valid");
		}
		
		if(type!=null)
		{
			System.out.println("Type is Valid");
		}
		
		else{
			System.err.println("Type is in Valid");
		}
		
		if(bakeryName!=null)
		{
			System.out.println("Bakery Name is Valid");
		}
		
		else{
			System.err.println("Bakery Name is in Valid");
		}
		
		if(price>10 && price<30)
		{
			System.out.println("Price is Valid");
		}
		
		else{
			System.err.println("price is in Valid");
		}
		
		if(noOfPieces>0 && noOfPieces<9)
		{
			System.out.println("Number of pieces is Valid");
		}
		
		else{
			System.err.println("Number of pieces is in Valid");
		}
		
		if(Occassion!=null)
		{
			System.out.println("Occassion is Valid");
		}
		
		else{
			System.err.println("Occassion is in Valid");
		}
	}
}
		