package com.xworkz.backUp;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> ref = new HashSet<String>();
		ref.add("veeru");
		ref.add("ramu");
		ref.add("darsh");
		ref.add("suraj");
		ref.add("praju");
		ref.add(null);
		ref.add(null);
		
		System.out.println("Total:" + ref.size());
		System.out.println(ref);
		
		Set<String> ref1 = new HashSet<String>();
		ref1.add("kiran");
		ref1.add("anup");
		ref1.add("vinay");
		ref1.add("suraj");
		ref1.add("praju");
		
		System.out.println(ref.addAll(ref1));
		System.out.println(ref);
		
		System.out.println("contains:" + ref.contains("veer"));
		System.out.println("containsAll:" + ref1.containsAll(ref));
		
		System.out.println("removeAll: " +  ref.removeAll(ref));
		System.out.println("addAll: " + ref.addAll(ref));
		System.out.println(ref);
		
		


	}

}
