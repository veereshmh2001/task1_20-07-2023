package com.xworkz.crud.app.runnre;

import com.xworkz.crud.app.impl.Groceryimpl;

public class GroceryRunner {

	public static void main(String[] args) {
		Groceryimpl repo=new Groceryimpl();
		repo.save("Sugar");
		repo.save("Paste");
		repo.save("Sugar");
		repo.save("Paste");
		repo.save("Sugar");
		repo.save("Paste");
		repo.save("Sugar");
		repo.save("Paste");
		repo.save("Sugar");
		repo.save("Paste");
	}

}
