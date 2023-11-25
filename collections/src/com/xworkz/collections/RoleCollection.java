package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RoleCollection {

	public static void main(String[] args) {
		
		Collection<String> roleCollection = new ArrayList<String>();
		roleCollection.add("Managaer");
		roleCollection.add("Manual Tester");
		roleCollection.add("Bussiness Analyst");
		roleCollection.add("HR");
		roleCollection.add("Data Engineer");
		
		
		for (String role : roleCollection) {
			if(role.endsWith("r"));
			System.out.println(role);
			
		}
		
		System.out.println("//////////");
		roleCollection.stream().filter((role)->role.endsWith("r")).forEach(r->System.out.println(r));
		
		System.out.println("////////");
		roleCollection.stream().filter(r->!r.contains("m")).forEach(r->System.out.println(r));
		
		List<String> rolesWithMList = roleCollection.stream().filter(r->r.contains("m")).collect(Collectors.toList());
		rolesWithMList.forEach(e->System.out.println(e));

	}
	
	

}
