package com.xworkz.backUp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lists {
	public static void main(String[] args) {
		List<Integer> ref =new LinkedList<Integer>();
		ref.add(1);
		ref.add(3);
		ref.add(5);
		ref.add(7);
		ref.add(null);
		ref.add(null);
		
		
		System.out.println("Total:" + ref.size());
		System.out.println(ref);
		
		System.out.println(ref.get(0));
		ref.remove(3);
		System.out.println("remove" +ref);
		ref.contains(1);
		System.out.println("contain" +ref);
		
		Iterator<Integer> itr = ref.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ref.get(1);
		System.out.println(ref);
		
		System.out.println("Remove All:" + ref.removeAll(ref));
		System.out.println(ref);
	}
	 
	

}
