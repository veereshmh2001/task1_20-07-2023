package com.xworkz.exception;

public class Bussiness {
	
	public void online(){
		System.out.println("Invoking main in Online bussiness");
		offline();
	}
	
	public void offline() {
		System.out.println("Invoking main in Offline bussiness");
		profit();
	}
	
	public void profit() {
		System.out.println("Invoking main in Profit in  bussiness");
		investment();
	}
	
	public void investment() {
		System.out.println("Invoking main in Investment bussiness");
		try {
			client();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void client() {
		System.out.println("Invoking main in Client bussiness");
		throw new SecurityException();
	}

}
