class CarromKiller{
	
	public static void main(String[] values){
		
		System.out.println("invoking main method in CarromKiller");
		
		Carrom carrom=new Carrom();
		
		Carrom carrom1=new Carrom("Wood");
		
		System.out.println("Material:"+carrom1.material);
		System.out.println("Shape:"+carrom1.shape);
		System.out.println("Brand:"+carrom1.brand);
		System.out.println("No Of Players:"+carrom1.noOfPlayers);
		System.out.println("Price:"+carrom1.price);
		System.out.println("\n");
		
		Carrom carrom2=new Carrom("Wood","Square");
		
		System.out.println("Material:"+carrom2.material);
		System.out.println("Shape:"+carrom2.shape);
		System.out.println("Brand:"+carrom2.brand);
		System.out.println("No Of Players:"+carrom2.noOfPlayers);
		System.out.println("Price:"+carrom2.price);
		System.out.println("\n");
		
		Carrom carrom3=new Carrom("Wood","Square",4);
		
		System.out.println("Material:"+carrom3.material);
		System.out.println("Shape:"+carrom3.shape);
		System.out.println("Brand:"+carrom3.brand);
		System.out.println("No Of Players:"+carrom3.noOfPlayers);
		System.out.println("Price:"+carrom3.price);
		System.out.println("\n");
		
		Carrom carrom4=new Carrom("Wood","Square", "MRF",4);
		
		System.out.println("Material:"+carrom4.material);
		System.out.println("Shape:"+carrom4.shape);
		System.out.println("Brand:"+carrom4.brand);
		System.out.println("No Of Players:"+carrom4.noOfPlayers);
		System.out.println("Price:"+carrom4.price);
		System.out.println("\n");
		
		Carrom carrom5=new Carrom("Wood","Square", "MRF",4,300);
		
		System.out.println("Material:"+carrom5.material);
		System.out.println("Shape:"+carrom5.shape);
		System.out.println("Brand:"+carrom5.brand);
		System.out.println("No Of Players:"+carrom5.noOfPlayers);
		System.out.println("Price:"+carrom5.price);
		System.out.println("\n");
	}
}