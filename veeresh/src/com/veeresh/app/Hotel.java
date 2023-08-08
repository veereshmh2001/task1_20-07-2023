package com.veeresh.app;

public class Hotel {
	public String name;
	public String location;
	public int rooms;
	public double rating;
	
	public void service() {
		System.out.println("invoking hotel no argumrnts ");
		service("Grand Plaza");
		service("City Center");
		service(150);
		service(4.5);
	}
	
	public void service(String name) {
		System.out.println("invoking hotel in String name ");
		System.out.println("Name" + name);

	}
	
	
	
	public void service(int rooms) {
		System.out.println("invoking hotel in int rooms");
		System.out.println("Rooms" + rooms);
		
	}
	
	public void service(double rating) {
		System.out.println("invoking hotel in double rating");
		System.out.println("Rating" + rating);
		
	}
	
	public void service(String name,String location,int rooms,double rating) {
		System.out.println("invoking hotel in String name,String location,int rooms, double rating");
		service(name);
		service(location);
		service(rooms);
		service(rating);
		
	}

}
