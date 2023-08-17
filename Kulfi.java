class Kulfi{
	
	static void taste(String flavor, int price, int noOfPieces){
		
		System.out.println("Invoking in Kulfi");
        System.out.println("Flavor : " + flavor);
        System.out.println("Price : " + price);
        System.out.println(" Number of Pieces : " + noOfPieces);
		
		if(flavor!=null)
		{
			System.out.println("Flavor is Valid");
		}
		
		else{
			System.err.println("Flavor is in Valid");
		}
			
		if(price>10  &&  price<50)
		{
			System.out.println("  Price is Valid ");
		}
		else{
			System.err.println( " Price is in Valid ");
		}
		
		if(noOfPieces>2  &&  noOfPieces<9)
		{
			System.out.println(" Number of Pieces is Valid ");
		}
		else{
			System.err.println( " Number of Pieces is in Valid ");
		}
		}
}
	