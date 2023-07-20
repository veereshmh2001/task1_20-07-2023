class Camera{
	
	static void click(String location,String date,int howManyPeople,String resoultion,String clarity, String cameraMan)
	{
		System.out.println("Invoking camera");
		System.out.println(" Location : " + location);
		System.out.println(" Date : " + date);
		System.out.println(" How Many People : " + howManyPeople);
		System.out.println(" Resoultion : " + resoultion);
		System.out.println(" Clarity : " + clarity);
		System.out.println(" Camera Man : " + cameraMan);
		
		if(location!=null)
		{
			System.out.println(" Location is Valid ");
		}
		else{
			System.err.println( "Location is in Valid ");
		}
		
		if(date!=null)
		{
			System.out.println(" Date is Valid ");
		}
		else{
			System.err.println( "Date is in Valid ");
		}
		
		if(howManyPeople>0 && howManyPeople<5)
		{
			System.out.println(" How Many People is Valid ");
		}
		else{
			System.err.println( " How Many People is in Valid ");
		}
		
		if(resoultion!=null)
		{
			System.out.println(" Resoultion is Valid ");
		}
		else{
			System.err.println( " Resolution is in Valid ");
		}
		
		if(clarity!=null)
		{
			System.out.println(" Clarity  is Valid ");
		}
		else{
			System.err.println( " Clarity is in Valid ");
		}
		
		if(cameraMan!=null)
		{
			System.out.println(" Camera Man is Valid ");
		}
		else{
			System.err.println( " Camera Man is in Valid ");
		}
	}
}
	