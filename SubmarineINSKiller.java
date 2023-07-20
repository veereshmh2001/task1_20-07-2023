class SubmarineINSKiller{
	
	public static void main(String[] values){
		
		System.out.println("invoking main method in SubmarineINSKiller");
		
		SubmarineINS submarineINS=new SubmarineINS();
		System.out.println("SubmarineINS: Engine type in main method " +submarineINS.name);
		System.out.println("SubmarineINS: Motto in main method " +submarineINS.motto);
		System.out.println("SubmarineINS: Speed in main method " +submarineINS.speed+"km/h");
		
		SubmarineINS submarineINS1=new SubmarineINS("INS Arihant", "Ever-Onward", 44);
		System.out.println("SubmarineINS: Engine type in main method " +submarineINS1.name);
		System.out.println("SubmarineINS: Motto in main method " +submarineINS1.motto);
		System.out.println("SubmarineINS: Speed in main method " +submarineINS1.speed+"km/h");
	}
}	