class ButterFlyHigh{
	
	public static void main(String[] args){
		
		System.out.println("invoking main method in ButterFlyHigh");
		
		Butterfly butterfly=new Butterfly("Monarch", "Red");
		Butterfly.printStatic();
		
		
		Butterfly butterfly1=new Butterfly(20, 20000);
		butterfly1.printInstance();
	}
}