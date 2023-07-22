class HelmetSafe{
	
	public static void main(String[] args){
		
		System.out.println("invoking main method in HelmetSafe");
		
		Helmet helmet=new Helmet("ISI","Full face",6,"black");
		Helmet.printStatic();
		helmet.printInstance();
		
		
		
	}
}