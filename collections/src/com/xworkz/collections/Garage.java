package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Garage {

	public static void main(String[] args) {
		
		Collection<String> collection = new ArrayList();
		collection.add("plier");
		collection.add("spanner");
		collection.add("hammer");
		collection.add("saw");
		collection.add("screw driver");
		collection.add("jack");
		collection.add("cutter");
		
		Collection<String> collection1 = new ArrayList();
		collection.add("flash light");
		collection.add("wrench");
		
		System.out.println("Tools : " + collection.size());

		Iterator<String> itr = collection.iterator();

		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println("Names : " + name);
		}
		
		System.out.println("Add all");
		
		collection.addAll(collection1);
		Iterator<String> itr2 = collection.iterator();

		while (itr2.hasNext()) {
			String name = itr2.next();
			System.out.println("Names : " + name);
		}
		
		System.out.println("remove all");
		
		collection.removeAll(collection1);
		Iterator<String> itr3 = collection.iterator();
		while (itr3.hasNext()) {
			String name = itr3.next();
			System.out.println("Names : " + name);
		}
		

	}

}
