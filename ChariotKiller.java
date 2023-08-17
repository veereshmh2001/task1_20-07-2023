class ChariotKiller{
	public static void main(String[] args){
		
		System.out.println("invoking main method in ChariotKiller");
		
		Chariot chariot=new Chariot();
		
		Chariot chariot1=new Chariot("War Chariot", "Black", 4, 2);
		System.out.println("Name:"+chariot1.name);
		System.out.println("Color:"+chariot1.color);
		System.out.println("Num of Wheels:"+chariot1.numWheels);
		System.out.println("Num of Horse:"+chariot1.numHorses);
		System.out.println("hasArmor:"+chariot1.hasArmor);
		System.out.println("hasWeapon:"+chariot1.hasWeapon);
		System.out.println("maxPassengers:"+chariot1.maxPassengers);
		System.out.println("driver:"+chariot1.driver);
		System.out.println("isMoving:"+chariot1.isMoving);
		System.out.println("speed:"+chariot1.speed);
		System.out.println("destination:"+chariot1.destination);
		System.out.println("\n");
		
		Chariot chariot2=new Chariot("War Chariot", "Black", 4, 2,true, true, 2, "Achilles");
		System.out.println("Name:"+chariot2.name);
		System.out.println("Color:"+chariot2.color);
		System.out.println("Num of Wheels:"+chariot2.numWheels);
		System.out.println("Num of Horse:"+chariot2.numHorses);
		System.out.println("hasArmor:"+chariot2.hasArmor);
		System.out.println("hasWeapon:"+chariot2.hasWeapon);
		System.out.println("maxPassengers:"+chariot2.maxPassengers);
		System.out.println("driver:"+chariot2.driver);
		System.out.println("isMoving:"+chariot2.isMoving);
		System.out.println("speed:"+chariot2.speed);
		System.out.println("destination:"+chariot2.destination);
		System.out.println("\n");
		
		Chariot chariot3=new Chariot("War Chariot", "Black", 4, 2,true, true, 2, "Achilles",true, 25.0, "Troy");
		System.out.println("Name:"+chariot3.name);
		System.out.println("Color:"+chariot3.color);
		System.out.println("Num of Wheels:"+chariot3.numWheels);
		System.out.println("Num of Horse:"+chariot3.numHorses);
		System.out.println("hasArmor:"+chariot3.hasArmor);
		System.out.println("hasWeapon:"+chariot3.hasWeapon);
		System.out.println("maxPassengers:"+chariot3.maxPassengers);
		System.out.println("driver:"+chariot3.driver);
		System.out.println("isMoving:"+chariot3.isMoving);
		System.out.println("speed:"+chariot3.speed);
		System.out.println("destination:"+chariot3.destination);
		System.out.println("\n");
	}
}
		
		