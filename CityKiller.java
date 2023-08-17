class CityKiller{
	
	public static void main(String[] values){
		
		System.out.println("invoking main method in CityKiller");
		
		City city=new City();
		System.out.println("City State in main method " +city.state);
		System.out.println("City city in main method " +city.city);
		System.out.println("City pincode in main method " +city.pincode);
		
		City city1=new City("Maharastra", " Pune", 111045L);
		System.out.println("City state in main method " +city1.state);
		System.out.println("City city in main method " +city1.city);
		System.out.println("City city in main method " +city1.pincode);
	}
}