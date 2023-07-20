class Scanner{
	
	static void code(String name, int amount, String company)
	{
		System.out.println("Invoking in Scanner");
        System.out.println("Name: " + name);
        System.out.println("Amount: " + amount);
        System.out.println("Company: " + company);
		
		if(name!=null)
		{
			System.out.println("  Name is Valid ");
		}
		else{
			System.err.println( " Name is in Valid ");
		}
		
		if(amount>100 && amount<600)
		{
			System.out.println("  Amount is Valid ");
		}
		else{
			System.err.println( " Amount is in Valid ");
		}
		
		if(company!=null)
		{
			System.out.println("Company is Valid");
		}
		
		else{
			System.err.println("Company is in Valid");
		}
	}
} 