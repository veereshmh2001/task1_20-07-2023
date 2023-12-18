package com.xworkz.backUp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionT {

	public static void main(String[] args) {
		System.out.println("Running main in Collection");

		Collection<String> collection = new ArrayList<String>();

		collection.add("Harisha");
		collection.add("Xworkz");
		collection.add("Ramu");
		collection.add("Rohan");
		// System.out.println( collection.isEmpty());
		System.out.println("Total:" + collection.size() + collection.hashCode());

		Iterator<String> itr = collection.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		Collection<String> collection1 = new ArrayList<String>();
		collection1.add("Harisha");
		collection1.add("Xworkz");
		collection1.add("Ramu");
		collection1.add("Rohan");

		System.out.println("Total:" + collection1.size() + collection1.hashCode());
		collection.addAll(collection1);
		System.out.println(collection.contains("Harisha"));
		System.out.println(collection.containsAll(collection1));

		System.out.println(collection.equals(collection1));
		System.out.println(collection.hashCode() + "" + collection1.hashCode());
		System.err.println(collection1.isEmpty());

	}
}
