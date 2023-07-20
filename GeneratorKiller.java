class GeneratorKiller{
	
	public static void main(String[] values){
		
		System.out.println("invoking main method in GeneratorKiller");
		
		Generator generator=new Generator();
		System.out.println("Generator: Engine type in main method " +generator.engineType);
		System.out.println("Generator: Backup in main method " +generator.backup+"hrs");
		System.out.println("Generator: Fuel tank in main method " +generator.fuelTank+"Liters");
		
		Generator generator1=new Generator("Electric Start", 9, 65);
		System.out.println("Generator: Engine type in main method " +generator1.engineType);
		System.out.println("Generator: Backup in main method " +generator1.backup+"hrs");
		System.out.println("Generator: Fuel tank in main method " +generator1.fuelTank+"Liters");
	}
}