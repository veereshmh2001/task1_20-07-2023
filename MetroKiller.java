class MetroKiller{
	
	public static void main(String[] values){
		
		System.out.println("invoking main in MetroKiller");
		Metro metro=new Metro();
		System.out.println(metro.name);
		System.out.println(metro.startLocation);
		System.out.println(metro.price);
		System.out.println(metro.destination);
		System.out.println(metro.usedFor);
		
		System.out.println("\n");
		
		Metro metro1=new Metro();
		metro1.name="Namma Metro";
		metro1.startLocation="Silk institute";
		metro1.price=55;
		metro1.destination="Nagsandra";
		metro1.usedFor="Fast Journey";
		System.out.println(metro1.name);
		System.out.println(metro1.startLocation);
		System.out.println(metro1.price);
		System.out.println(metro1.destination);
		System.out.println(metro1.usedFor);
		
	}
}