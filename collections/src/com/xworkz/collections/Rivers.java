package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Rivers {

	public static void main(String[] args) {
		System.out.println("Running main in Strings");

		Collection<String> collection = new ArrayList();
		collection.add("Kaveri");
		collection.add("Narmada");
		collection.add("Ganga");
		collection.add("Godavari");
		collection.add("Yamuna");
		
		Collection<String> collection1 = new ArrayList();
		collection.add("Sindhu");

		System.out.println("Total Rivers : " + collection.size());

		Iterator<String> itr = collection.iterator();

		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println("Names : " + name);
		}
		System.out.println("Remove Kaveri");

		collection.remove("Kaveri");
		Iterator<String> itr1 = collection.iterator();

		while (itr1.hasNext()) {
			String name1 = itr1.next();
			System.out.println("Names : " + name1);
		}
		System.out.println("addAll");
		collection.addAll(collection1);
		Iterator<String> itr2 = collection.iterator();

		while (itr2.hasNext()) {
			String name2 = itr2.next();
			System.out.println("Names : " + name2);
		}
		
		
		System.out.println("Contains");
		System.out.println(collection.contains("Yamuna"));
		System.out.println(collection.isEmpty());
		
		System.out.println("ContainsAll");
		collection.containsAll(collection);
		Iterator<String> itr3 = collection.iterator();

		while (itr3.hasNext()) {
			String name2 = itr3.next();
			System.out.println("Names : " + name2);
		}

	}

}
