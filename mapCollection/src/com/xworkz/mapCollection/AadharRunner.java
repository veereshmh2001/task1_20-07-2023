package com.xworkz.mapCollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AadharRunner {

	public static void main(String[] args) {
		
		Map<String, Long> person= new HashMap<String, Long>();
		person.put("veeru", 122132145698L);
		person.put("darshan", 866051295346L);
		person.put("prajwal", 654132145698L);
		person.put("rohan", 852132145698L);
		person.put("ramu", 654932145698L);
		person.put("suraj", 445632145698L);
		person.put("vinay", 789632145698L);
		person.put("prasad", 365132145698L);
		person.put("om", 953132145698L);
		person.put("harisha", 159132145698L);
		
		Set<String> name=person.keySet();
		name.forEach(c->System.out.println(c) );
		
		System.out.println("--------------------");
		
		Collection<Long> number=person.values();
		number.forEach(n->System.out.println(n));
		
		System.out.println("--------------------");
		
		Set<Entry<String,Long>> ref=person.entrySet();
		ref.forEach(r->System.out.println(r));
		

	}

}
