class GymKiller{
	
	public static void main(String[] values){
		
		System.out.println("invoking main in GymKiller");
		Gym gym=new Gym();
		System.out.println(gym.name);
		System.out.println(gym.location);
		System.out.println(gym.price);
		System.out.println(gym.trainerName);
		System.out.println(gym.use);
		
		System.out.println("\n");
		
		Gym gym1=new Gym();
		gym1.name="Veeru";
		gym1.location="Hubli";
		gym1.price=5000;
	    gym1.trainerName="Vinya";
		gym1.use="Fitness";
		System.out.println( gym1.name);
		System.out.println(gym1.location);
		System.out.println(gym1.price);
		System.out.println(gym1.trainerName);
		System.out.println(gym1.use);
		
	}
}