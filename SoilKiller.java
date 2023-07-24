class SoilKiller{
	
	public static void main(String[] args){
		
		System.out.println("invoking main method in SoilKiller");
		
		Soil soil=new Soil("Loam", 6.5);
		Soil.printStatic();
		
		
		Soil soil1=new Soil( true, 40);
		soil1.printInstance();
	}
}