class Carpenter
{
	static void wood()
	{
		System.out.println("invoking main wood in Carpenter");
		Carpenter.timber();
	}
	static void timber()
	{
		System.out.println("invoking main timber in Carpenter");
		Carpenter.cutting(20);
	}
	static void cutting( int size)
	{
		System.out.println("invoking main cutting(int) in Carpenter");
		System.out.println("size :" +size);
		Carpenter.screw("wood");
		
	}
	static void screw(String material)
	{
		System.out.println("invoking main screw(String) in Carpenter");
		System.out.println("materials :" +material);
		Carpenter.plumb("wood");
	}
	
	static void plumb( String material)
	{
		System.out.println("invoking main plumb(String) in Carpenter");
		System.out.println("material :" +material);
		Carpenter.marking(100);
		
	}
	static void marking(int length)
	{
		System.out.println("invoking main marking(int) in Carpenter");
		System.out.println("length :" +length);
		Carpenter.shape();
		
	}
	static void shape()
	{
		System.out.println("invoking main shape in Carpenter");
		Carpenter.plan();
	}
	
	static void plan()
	{
		System.out.println("invoking main plan in Carpenter");
		Carpenter.tool();
	}
	static void tool()
	{
		System.out.println("invoking main work in Carpenter");
		Carpenter.Working();
	}
	static void Working()
	{
		System.out.println("invoking main tool in Carpenter");
		Carpenter.finish();
	}
	static void finish()
	{
		System.out.println("invoking main finish in Carpenter");
	}
}