class Brick{
	
	 static int length;
     static int width;
     int height;
     String color;
	 
	 Brick(int length,int width)
	 {
		 System.out.println("invoking at static argument in Brick");
		 this.length=length;
		 this.width=width;
	 }
	 
	 Brick(int height,String color)
	 {
		 System.out.println("invoking at Instance argument in Brick");
		 this.height=height;
		 this.color=color;
	 }
	 
	 static void printStatic()
	 {
		 System.out.println("invoking at static void in Brick");
		 System.out.println(length);
		 System.out.println(width);
	 }
	 
	 void printInstance()
	 {
		 System.out.println("invoking at void Instance in Brick");
		 System.out.println(height);
		 System.out.println(color);
	 }
}