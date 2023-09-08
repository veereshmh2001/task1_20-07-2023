package com.xworkz.crud.app.runnre;

import com.xworkz.crud.app.impl.service.GroceryServiceImpl;
import com.xworkz.crud.app.service.GroceryService;

public class GroceryServiceRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in runner");
		GroceryService groceryservice = new GroceryServiceImpl(null);
		groceryservice.validteandsave("sugarpowder");

	}

}
