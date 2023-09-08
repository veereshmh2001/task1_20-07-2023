package com.xworkz.crud.app.impl.service;

import com.xworkz.crud.app.service.GroceryService;

public class GroceryServiceImpl implements GroceryService {
	private GroceryService groceryservice;

	@Override
	public boolean validteandsave(String grocery) {
		if (grocery != null && !grocery.isEmpty() && grocery.length() > 3 && grocery.length() <= 6) {
			System.out.println("Grocery is Available");
		} else {
			System.err.println("Grocery not Available");
		}
		return false;
	}

	public GroceryServiceImpl(GroceryService groceryservice) {

		this.groceryservice = groceryservice;
	}

}
