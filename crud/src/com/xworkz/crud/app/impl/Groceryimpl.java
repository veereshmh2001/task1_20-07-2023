package com.xworkz.crud.app.impl;

import com.xworkz.crud.app.reopsitory.Grocery;

public class Groceryimpl implements Grocery {
	private String[] groceries=new String [TOTAL_ITEMS];
	int position;

	@Override
	public void save(String grocery) {
		System.out.println("invoking");
		this.groceries[position]=grocery;
		if(this.position<TOTAL_ITEMS) {
		System.out.println("Stored " +grocery + "in position " + this.position);
		this.position++;
		}
		else {
			System.err.println("Limit is full");
		}

	}
	

}
