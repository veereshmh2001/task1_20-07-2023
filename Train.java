class Train{
	
	static String getTrainName(int trainNo)
	{
		System.out.println("Invoking getTrainName trainNo");
		
		if(trainNo>1000)
		{
			System.out.println("trainNo is valid");
			
			if(11013==trainNo)
			{
				return "chennai exp";
			}
			
			if(140==trainNo)
			{
				return "hubli exp";
			}
			
			if(12134==trainNo)
			{
				return "delhi exp";
			}
			
			if(22691==trainNo)
			{
				return "belgavi exp";
			}
			
		}
		else{
			System.out.println("trainNo is in valid");
		}
		return "not defined";
	}
}
		