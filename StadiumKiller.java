class StadiumKiller{
	
	public static void main(String[] values){
		
		System.out.println("invoking main in StadiumKiller");
		Stadium stadium=new Stadium();
		System.out.println(stadium.name);
		System.out.println(stadium.gameName);
		System.out.println(stadium.noOfPlayers);
		System.out.println(stadium.type);
		System.out.println(stadium.usedFor);
		
		System.out.println("\n");
		
		Stadium stadium1=new Stadium();
		stadium1.name="Eden Garden";
		stadium1.gameName="Cricket";
		stadium1.noOfPlayers=32;
		stadium1.type="Outdoor";
		stadium1.usedFor="IPL";
		System.out.println(stadium1.name);
		System.out.println(stadium1.gameName);
		System.out.println(stadium1.noOfPlayers);
		System.out.println(stadium1.type);
		System.out.println(stadium1.usedFor);
		
	}
}