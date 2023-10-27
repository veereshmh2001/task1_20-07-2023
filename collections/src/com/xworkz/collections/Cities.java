package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Cities {
	public static void main(String[] args) {
		
		Collection<String> collection = new ArrayList();
		collection.add("Bangalore ");
		collection.add("Mysore");
		collection.add("Mangalore ");
		collection.add("Hubli ");
		collection.add("Belgaum ");
		collection.add("Gulbarga ");
		collection.add("Davangere ");
		collection.add("Bellary ");
		collection.add("Shimoga ");
		collection.add("Tumkur ");
		collection.add("Bijapur ");
		collection.add("Hospet ");
		collection.add("Raichur ");
		collection.add("Bidar ");
		collection.add("Udupi ");
		collection.add("Hassan ");
		collection.add("Dharwad ");
		collection.add("Bagalkot ");
		collection.add("Gadag ");
		collection.add("Chitradurga ");
		
System.out.println("Total Models : " + collection.size());
		
		Iterator<String> itr = collection.iterator();

		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println("Model : " + name);
		}

	}

}
