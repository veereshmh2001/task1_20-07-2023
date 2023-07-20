class Chariot{
	
	String name;
    String color;
    int numWheels;
    int numHorses;
    boolean hasArmor;
    boolean hasWeapon;
    int maxPassengers;
    String driver;
    boolean isMoving;
    double speed;
    String destination;
	
	Chariot(){
	System.out.println("invoking main in chariot");
	System.out.println("name:"+this.name);
	System.out.println("color:"+this.color);
	System.out.println("numWheels:"+this.numWheels);
	System.out.println("numHorses:"+this.numHorses);
	System.out.println("hasArmor:"+this.hasArmor);
	System.out.println("hasWeapon:"+this.hasWeapon);
	System.out.println("maxPassengers:"+this.maxPassengers);
	System.out.println("driver:"+this.driver);
	System.out.println("isMoving:"+this.isMoving);
	System.out.println("speed:"+this.speed);
	System.out.println("destination:"+this.destination);
	System.out.println("\n");}
	
	Chariot(String name, String color, int numWheels, int numHorses)
	{
		System.out.println("invoking main in chariot");
		this.name = name;
        this.color = color;
        this.numWheels = numWheels;
        this.numHorses = numHorses;
        this.hasArmor = hasArmor;
        this.hasWeapon = hasWeapon;
        this.maxPassengers = maxPassengers;
        this.driver = driver;
        this.isMoving = isMoving;
        this.speed = speed;
        this.destination = destination;
	}
	
	Chariot(String name, String color, int numWheels, int numHorses, boolean hasArmor, boolean hasWeapon,int maxPassengers, String driver)
	{
		System.out.println("invoking main in chariot");
		this.name = name;
        this.color = color;
        this.numWheels = numWheels;
        this.numHorses = numHorses;
        this.hasArmor = hasArmor;
        this.hasWeapon = hasWeapon;
        this.maxPassengers = maxPassengers;
        this.driver = driver;
        this.isMoving = isMoving;
        this.speed = speed;
        this.destination = destination;
	}
	
	Chariot(String name, String color, int numWheels, int numHorses, boolean hasArmor, boolean hasWeapon,int maxPassengers, String driver, boolean isMoving, double speed, String destination)
	{
		System.out.println("invoking main in chariot");
		this.name = name;
        this.color = color;
        this.numWheels = numWheels;
        this.numHorses = numHorses;
        this.hasArmor = hasArmor;
        this.hasWeapon = hasWeapon;
        this.maxPassengers = maxPassengers;
        this.driver = driver;
        this.isMoving = isMoving;
        this.speed = speed;
        this.destination = destination;
	}
}