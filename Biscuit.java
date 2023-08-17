class Biscuit{
	
	public static void main(String[] args){
		
		System.out.println(" Biscuits Names" );
		
		String parleg="Parle G";
		String oreo="Oreo";
		String monaco="Monaco";
		String happyhappy="Happy Happy";
		String unibic="Unibic";
		String burbon="Burbon";
		
		String[] biscuits={unibic,monaco,parleg,happyhappy,burbon,oreo};
		
		int total=biscuits.length;
		
		System.out.println("Total biscuits: "+total);
		
		for (int start=0;start<biscuits.length;start++)
		{
			System.out.println(" Biscuit " + start + " at " + biscuits[start]);
		}
		
		biscuits[2]=" Good Day ";
		System.out.println(" The updated value ");
		
		System.out.println("\n");
		
		for (int start=biscuits.length-1;start>=0;start--)
		{
			System.out.println(" Biscuit " + start + " at " + biscuits[start]);
		}
}}
		
		