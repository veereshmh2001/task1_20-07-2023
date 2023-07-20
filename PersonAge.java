class PersonAge{
	
	static int getAgeByName(String person )
	{
		System.out.println("Invoking getAgeByName of Person");
		
		if(person!=null)
		{
			System.out.println("Person Age is valid");
			
			if("veeresh"==person)
			{
				return 23;
			}
			
			if("darshan"==person)
			{
				return 24;
			}
			
			if("raman"==person)
			{
				return 13;
			}
			
			if("vinyak"==person)
			{
				return 22;
			}
			
			if("suaj"==person)
			{
				return 33;
			}
			
			if("anup"==person)
			{
				return 24;
			}
			
			if("kiran"==person)
			{
				return 21;
			}
			
			if("ravi"==person)
			{
				return 25;
			}
			
			if("rahul"==person)
			{
				return 34;
			}
			
			if("adarsh"==person)
			{
				return 20;
			}
		}
		else{
			System.err.println("Person Age is in valid");
			}
			return -1;
		
	}
}