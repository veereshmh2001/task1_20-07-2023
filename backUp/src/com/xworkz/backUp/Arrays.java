package com.xworkz.backUp;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;

public class Arrays {
	
	public static void main(String[] args) {
		
		ArrayList<String> ref = new ArrayList<String>();
		ref.add("Bangalore");
		ref.add("Mangalore");
		ref.add("Hubballi");
		ref.add("Dharwad");
		ref.add("Gadag");
		
		System.out.println("Total : " + ref.size());
		System.out.println(ref);
		
		System.out.println("Index value 3 " + ref.get(3));
		
		
		System.out.println("Contain:" + ref.contains("Hubli"));
		
		if(ref.isEmpty()) {
			System.out.println("True");
		}else {
			System.err.println("False");
		}
		
		System.out.println(ref.equals(ref));
		
		ListIterator<String> itr= ref.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("//////");
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		 
	}

}
