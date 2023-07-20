class FabricPrice{
	
	public static void main(String[] args)
	{
		System.out.println("Running price of fabric");
		
		int ref=Fabric.getPrice("cotton");
		System.out.println("Ref : " + ref);
		
		int ref1=Fabric.getPrice("nylon");
		System.out.println("Ref1 : " + ref1);
		
		int ref2=Fabric.getPrice("woolen");
		System.out.println("Ref2 : " + ref2);
		
		int ref3=Fabric.getPrice("linen");
		System.out.println("Ref3 : " + ref3);
		
		int ref4=Fabric.getPrice("polyster");
		System.out.println("Ref4 : " + ref4);
		
		int ref5=Fabric.getPrice("silk");
		System.out.println("Ref5 : " + ref5);
	}
}