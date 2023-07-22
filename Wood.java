class Wood{
	
	String type;
	double length;
	double width;
	int noOfPieces;
	boolean isSeasoned;
	
	Wood()
	{
		System.out .println("invoking no-argument in wood");
	}
	
	Wood(String type)
	{
		super();
		System.out.println("invoking String type in wood");
		this.type=type;
	}
	
	Wood(String type, double length)
	{
		this(type);
		System.out.println("invoking String type, double length in wood");
		
		this.length=length;
	}
	
	Wood(String type, double length, double width)
	{
		this(type,length);
		System.out.println("invoking String type, double length, double width in wood");
		
		this.width=width;
	}
	
	Wood(String type, double length, double width, int noOfPieces)
	{
		this(type,length,width);
		System.out.println("invoking String type, double length, double width, int noOfPieces in wood");
		
		this.noOfPieces=noOfPieces;
	}
	
	Wood(String type, double length, double width, int noOfPieces, boolean isSeasoned)
	{
		this(type,length,width,noOfPieces);
		System.out.println("invoking String type, double length, double width, int noOfPieces, boolean isSeasoned in wood");
		
		this.isSeasoned=isSeasoned;
	}
}
	