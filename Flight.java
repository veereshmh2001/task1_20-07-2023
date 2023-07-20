class Flight{
	
	public static void main(String[] args){
		
		
		System.out.println("Flight Names");
		
		String indigo="IndiGo";
		String airindia="Air India";
		String spicejet="Spice jet";
		String vistara="Vistara";
		String qatarairways="Qatar Airways";
		String saudia="Saudia";
		String originair="Origin Air";
		
		String[] flights={vistara,originair,indigo,airindia,saudia,spicejet,qatarairways};
		
		int total=flights.length;
		
		System.out.println("Total : " + total);
		
		for (int start=0; start<flights.length; start++)
		{
			System.out.println(" Flight " + start + " is " + flights[start]);
		}
		
		flights[5]=" Veeru ";
		System.out.println(" The updated value ");
		System.out.println("\n");
		for(int start=flights.length-1;start>=0;start--)
		{
			System.out.println(" Flight " + start + " is " + flights[start]);
		}
	}
}