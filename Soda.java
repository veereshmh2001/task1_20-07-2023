class Soda{
	
	static void chilled(String flavour, int quantity, int price)
	{
		System.out.println("Invoking in soda");
        System.out.println("Flavour: " + flavour);
        System.out.println("Quantity: " + quantity + " ml ");
        System.out.println("Price: " + price + "rupees");
		
		if(flavour!=null)
		{
			System.out.println("  Temperature is Valid ");
		}
		else{
			System.err.println( " Flavour is in Valid ");
		}
		
		if(quantity>20  &&  quantity<40)
		{
			System.out.println("  Quantity is Valid ");
		}
		else{
			System.err.println( " Quantity is in Valid ");
		}
		
		if(price>10 && price<30)
		{
			System.out.println("Price is Valid");
		}
		
		else{
			System.err.println("Price is in Valid");
		}
	}
} 