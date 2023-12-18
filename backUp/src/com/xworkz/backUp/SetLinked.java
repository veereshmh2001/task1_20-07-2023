package com.xworkz.backUp;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> ref = new LinkedHashSet<String>();
		ref.add("a");
		ref.add("b");
		ref.add("c");
		ref.add("d");
		System.out.println(ref.size());
		System.out.println(ref);
		
		Set<String> ref1 = new LinkedHashSet<String>();

		ref1.add("e");
		ref1.add("f");
		ref1.add("g");
		ref1.add("h");

		System.out.println("Add all" + ref.addAll(ref1));
		System.out.println(ref);

	}

}
