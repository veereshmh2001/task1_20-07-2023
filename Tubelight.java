class Tubelight{
	
	String brand;
	String type;
	int length;
	
	Tubelight()
	{
		System.out.println("invoking no-argument of Tubelight");
		System.out.println("Brand :" + this.brand);
		System.out.println("Type :" + this.type);
		System.out.println("Length :" + this.length +"m");
		this.brand="Crompton";
		this.type="LED";
		this.length=112;
	}
	
	Tubelight(String brand, String type, int length)
	{
		System.out.println("invoking constructor of Tubelight");
		System.out.println("Brand :" + this.brand);
		System.out.println("Type :" + this.type);
		System.out.println("Length :" + this.length +"m");
		this.brand=brand;
		this.type=type;
		this.length=length;
	}
}