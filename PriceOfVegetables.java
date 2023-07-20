class PriceOfVegetables{
	
	public static void main(String[] args){
		
		System.out.println(" Prices of Vegetables ");
		
		
		
		String tomato=" Tomato is 50 ";
		String brinjal=" Brinjal is 40  ";
		String onion=" Onion is 60 ";
		String beans=" Beans is 70 ";
		String potato=" Potato is 30 ";
		String chilly=" Chilly is 20 ";
		String raddish=" Raddish is 35 ";
		
		String[] prices={potato,tomato,onion,beans,raddish,brinjal,chilly};
		
		int total=prices.length;
		
		System.out.println("Total : " + total);
		
		
		
		for (int start=0; start<prices.length; start++)
		{
			System.out.println("  PriceOfVegetables " + start + " are " + prices[start]);
		}
		
		prices[3]="carrort";
		System.out.println("The updated value");
		
		System.out.println("\n");
		
		for (int start=prices.length-1; start>=0; start--)
		{
			System.out.println( " PriceOfVegetables " + start + " are " + prices[start]);
		}
	}
}