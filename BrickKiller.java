class BrickKiller{
	
	public static void main(String[] args){
		
		System.out.println("invoking main method in BrickKiller");
		
		Brick brick=new Brick(10, 5);
		Brick.printStatic();
		
		
		Brick brick1=new Brick( 3, "Red");
		brick1.printInstance();
	}
}