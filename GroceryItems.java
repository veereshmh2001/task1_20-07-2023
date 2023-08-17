class GroceryItems{
	
	public static void main(String[] args){
		
		System.out.println(" Grocery Items ");
		 
		String jawar=" Jawar ";
		String sugar=" Sugar ";
		String salt=" Salt ";
		String teapowder=" Tea Powder ";
		String brush=" Brush ";
		String oil=" Oil ";
		String nuts=" Nuts ";
		
		String[] grocerys={teapowder,oil,nuts,jawar,brush,salt,sugar};
		
		int total=grocerys.length;
		
		System.out.println("Total : " + total);
		
		for (int start=0; start<grocerys.length; start++)
		{
			System.out.println(" GroceryItems " + start + " are " + grocerys[start]);
		}
		
		grocerys[0]=" Paste ";
		System.out.println("The updated value");
		
		System.out.println("\n");
		
		for (int start=grocerys.length-1; start>=0; start--)
		{
			System.out.println( " Grocery Items " + start + " are " +grocerys[start]);
		}
	}
}