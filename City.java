class City{
	
	String state;
	String city;
	Long pincode;
	
	City()
	{
		System.out.println("invoking no-argument of City");
		System.out.println("State :" + this.state);
		System.out.println("City :" + this.city);
		System.out.println("Pincode :" + this.pincode);
		this.state="Karnataka";
		this.city="Hubblli";
		this.pincode=580032L;
	}
	
	City(String state, String city, long pincode)
	{
		System.out.println("invoking constructor of City");
		System.out.println("State :" + this.state);
		System.out.println("City :" + this.city);
		System.out.println("Pincode :" + this.pincode);
		this.state=state;
		this.city=city;
		this.pincode=pincode;
	}
}