class LogoKiller{
	
	public static void main(String[] args){
		
		System.out.println("invoking main method in LogokKller");
		
		Logo logo=new Logo();
		
		Logo logo1=new Logo("Circle");
		
		System.out.println("Shape:"+logo1.shape);
		System.out.println("color:"+logo1.color);
		System.out.println("width:"+logo1.width);
		System.out.println("height:"+logo1.height);
		System.out.println("is3D:"+logo1.is3D);
		System.out.println("font:"+logo1.font);
		System.out.println("text:"+logo1.text);
		System.out.println("slogan:"+logo1.slogan);
		System.out.println("sloganColor:"+logo1.sloganColor);
		System.out.println("\n");
		
		Logo logo2=new Logo("Circle", "Blue", 100);
		
		System.out.println("Shape:"+logo2.shape);
		System.out.println("color:"+logo2.color);
		System.out.println("width:"+logo2.width);
		System.out.println("height:"+logo2.height);
		System.out.println("is3D:"+logo2.is3D);
		System.out.println("font:"+logo2.font);
		System.out.println("text:"+logo2.text);
		System.out.println("slogan:"+logo2.slogan);
		System.out.println("sloganColor:"+logo2.sloganColor);
		System.out.println("\n");
		
		Logo logo3=new Logo("Circle", "Blue", 100,100, true, "My Company");
		
		System.out.println("Shape:"+logo3.shape);
		System.out.println("color:"+logo3.color);
		System.out.println("width:"+logo3.width);
		System.out.println("height:"+logo3.height);
		System.out.println("is3D:"+logo3.is3D);
		System.out.println("font:"+logo3.font);
		System.out.println("text:"+logo3.text);
		System.out.println("slogan:"+logo3.slogan);
		System.out.println("sloganColor:"+logo3.sloganColor);
		System.out.println("\n");
		
		Logo logo4=new Logo("Circle", "Blue", 100,100, true, "My Company","Arial", "Quality Matters", "Green");
		
		System.out.println("Shape:"+logo4.shape);
		System.out.println("color:"+logo4.color);
		System.out.println("width:"+logo4.width);
		System.out.println("height:"+logo4.height);
		System.out.println("is3D:"+logo4.is3D);
		System.out.println("font:"+logo4.font);
		System.out.println("text:"+logo4.text);
		System.out.println("slogan:"+logo4.slogan);
		System.out.println("sloganColor:"+logo4.sloganColor);
		System.out.println("\n");
	}
}
		
		

