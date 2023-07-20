class Generator{
	
	String engineType;
	int backup;
	int fuelTank;
	
	Generator()
	{
		System.out.println("invoking no-argument of Generator");
		System.out.println("EngineType :" + this.engineType);
		System.out.println("Backup :" + this.backup + "hrs");
		System.out.println("Fuel Tank :" + this.fuelTank +"Liters");
		this.engineType="AC Cooler";
		this.backup=15;
		this.fuelTank=25;
	}
	
	Generator(String engineType, int backup, int fuelTank)
	{
		System.out.println("invoking constructor of Generator");
		System.out.println("EngineType :" + this.engineType);
		System.out.println("Backup :" + this.backup + "hrs");
		System.out.println("Fuel Tank :" + this.fuelTank + "Liters");
		this.engineType=engineType;
		this.backup=backup;
		this.fuelTank=fuelTank;
	}
}