class BadmintonKiller{
	
	public static void main(String[] values){
		
		System.out.println("invoking main in BadmintonKiller");
		Badminton badminton=new Badminton();
		System.out.println(badminton.type);
		System.out.println(badminton.benifit);
		System.out.println(badminton.noOfPlayers);
		System.out.println(badminton.hit);
		System.out.println(badminton.typeOfSport);
		
		System.out.println("\n");
		
		Badminton badminton1=new Badminton();
		badminton1.type="Game";
		badminton1.benifit="Fittness";
		badminton1.noOfPlayers=2;
		badminton1.hit="Shuttlecock";
		badminton1.typeOfSport="Racquet sport";
		System.out.println(badminton1.hit);
		System.out.println(badminton1.benifit);
		System.out.println(badminton1.noOfPlayers);
		System.out.println(badminton1.type);
		System.out.println(badminton1.typeOfSport);
		
	}
}