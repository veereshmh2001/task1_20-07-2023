class SubmarineINS{
	
	String name;
	String motto;
	int speed;
	
	SubmarineINS()
	{
		System.out.println("invoking no-argument of Submarine");
		System.out.println("Name :" + this.name);
		System.out.println("Motto :" + this.motto);
		System.out.println("Speed :" + this.speed +"km/h");
		this.name="INS Kalvari";
		this.motto="Ever Onward";
		this.speed=20;
	}
	
	SubmarineINS(String name, String motto, int speed)
	{
		System.out.println("invoking constructor of SubmarineINS");
		System.out.println("Name :" + this.name);
		System.out.println("Motto :" + this.motto);
		System.out.println("Speed :" + this.speed + "km/h");
		this.name=fuelTank;
		this.motto=motto;
		this.speed=speed;
	}
}