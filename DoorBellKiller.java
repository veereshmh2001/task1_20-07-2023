class DoorBellKiller{
	
	public static void main(String[] values){
		
		System.out.println("invoking main method in DoorBellKiller");
		
		DoorBell doorBell=new DoorBell();
		
		DoorBell doorBell1=new DoorBell("Syska");
		
		System.out.println("brand:"+doorBell1.brand);
		System.out.println("material:"+doorBell1.material);
		System.out.println("color:"+doorBell1.color);
		System.out.println("type:"+doorBell1.type);
		System.out.println("numberOfTunes:"+doorBell1.numberOfTunes);
		System.out.println("manufacture:"+doorBell1.manufacture);
		System.out.println("power:"+doorBell1.power);
		System.out.println("\n");
		DoorBell doorBell2=new DoorBell("Syska","Plastic");
		
		System.out.println("brand:"+doorBell2.brand);
		System.out.println("material:"+doorBell2.material);
		System.out.println("color:"+doorBell2.color);
		System.out.println("type:"+doorBell2.type);
		System.out.println("numberOfTunes:"+doorBell2.numberOfTunes);
		System.out.println("manufacture:"+doorBell2.manufacture);
		System.out.println("power:"+doorBell2.power);
		System.out.println("\n");
		
		DoorBell doorBell3=new DoorBell("Syska","Plastic", "White");
		
		System.out.println("brand:"+doorBell3.brand);
		System.out.println("material:"+doorBell3.material);
		System.out.println("color:"+doorBell3.color);
		System.out.println("type:"+doorBell3.type);
		System.out.println("numberOfTunes:"+doorBell3.numberOfTunes);
		System.out.println("manufacture:"+doorBell3.manufacture);
		System.out.println("power:"+doorBell3.power);
		System.out.println("\n");
		
		DoorBell doorBell4=new DoorBell("Syska","Plastic", "White","Wire less");
		
		System.out.println("brand:"+doorBell4.brand);
		System.out.println("material:"+doorBell4.material);
		System.out.println("color:"+doorBell4.color);
		System.out.println("type:"+doorBell4.type);
		System.out.println("numberOfTunes:"+doorBell4.numberOfTunes);
		System.out.println("manufacture:"+doorBell4.manufacture);
		System.out.println("power:"+doorBell4.power);
		System.out.println("\n");
		
		DoorBell doorBell5=new DoorBell("Syska","Plastic", "White","Wire less",30);
		
		System.out.println("brand:"+doorBell5.brand);
		System.out.println("material:"+doorBell5.material);
		System.out.println("color:"+doorBell5.color);
		System.out.println("type:"+doorBell5.type);
		System.out.println("numberOfTunes:"+doorBell5.numberOfTunes);
		System.out.println("manufacture:"+doorBell5.manufacture);
		System.out.println("power:"+doorBell5.power);
		System.out.println("\n");
		
		DoorBell doorBell6=new DoorBell("Syska","Plastic", "White","Wire less",30,"India");
		
		System.out.println("brand:"+doorBell6.brand);
		System.out.println("material:"+doorBell6.material);
		System.out.println("color:"+doorBell6.color);
		System.out.println("type:"+doorBell6.type);
		System.out.println("numberOfTunes:"+doorBell6.numberOfTunes);
		System.out.println("manufacture:"+doorBell6.manufacture);
		System.out.println("power:"+doorBell6.power);
		System.out.println("\n");
		
		DoorBell doorBell7=new DoorBell("Syska","Plastic", "White","Wire less",30,"India","Battery");
		
		System.out.println("brand:"+doorBell7.brand);
		System.out.println("material:"+doorBell7.material);
		System.out.println("color:"+doorBell7.color);
		System.out.println("type:"+doorBell7.type);
		System.out.println("numberOfTunes:"+doorBell7.numberOfTunes);
		System.out.println("manufacture:"+doorBell7.manufacture);
		System.out.println("power:"+doorBell7.power);
		System.out.println("\n");
	}
	
}