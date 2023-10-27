package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class States {
	public static void main(String[] args) {
		
		Collection<String> collection = new ArrayList();
		collection.add("Karnataka");
		collection.add("Goa");
		collection.add("Kerala");
		collection.add("TamilNadu");
		collection.add("AndhraPradesh");
		collection.add("Telangana");
		collection.add("Maharastra");
		collection.add("Gujurat");
		collection.add("Rajastan");
		collection.add("Punjab");
		collection.add("Delhi");
		collection.add("Haryana");
		collection.add("JammuKashmir");
		collection.add("HimachalPradesh");
		collection.add("Uttarakhand");
		collection.add("UttarPradesh");
		collection.add("MadhyaPradesh");
		collection.add("Jharkhand");
		collection.add("Odisha");
		collection.add("Bihar");
		collection.add("Chhattisgarh");
		collection.add("Assam");
		collection.add("ArunachalPradesh");
		collection.add("Nagaland");
		collection.add("Manipur");
		collection.add("Meghalaya");
		collection.add("Mizoram");
		collection.add("Tripura");
		collection.add("Sikkim");
		
		System.out.println("Total States : " + collection.size());
		
		Collection<String> collection1 = new ArrayList();
		collection1.add("Delhi");
		
		Iterator<String> itr = collection.iterator();

		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println("Names : " + name);
		}
		
		System.out.println("Remove");
		
		collection.remove("Delhi");
		Iterator<String> itr1 = collection.iterator();

		while (itr1.hasNext()) {
			String name1 = itr1.next();
			System.out.println("Names : " + name1);
		}
		
		System.out.println("addAll");
		
		
		collection.addAll(collection1);
		Iterator<String> itr2 = collection.iterator();

		while (itr2.hasNext()) {
			String name = itr2.next();
			System.out.println("Names : " + name);
		}
		
		System.out.println("Contains");
		System.out.println(collection.contains("Sikkim"));
		System.out.println(collection.isEmpty());
		
		System.out.println("ContainsAll");
		collection.containsAll(collection);
		Iterator<String> itr3 = collection.iterator();

		while (itr3.hasNext()) {
			String name = itr3.next();
			System.out.println("Names : " + name);
		}
		
		
		

		
	}

}
