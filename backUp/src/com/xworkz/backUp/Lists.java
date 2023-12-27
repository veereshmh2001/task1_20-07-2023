package com.xworkz.backUp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {
	public static void main(String[] args) {
		List<Integer> ref = new LinkedList<Integer>();
		ref.add(1);
		ref.add(3);
		ref.add(5);
		ref.add(7);

//		for (Integer element : ref) {
//			System.out.println(element + 3);
//		}
		System.out.println("Stream");
		ref.stream().map(element -> element + 3).forEach(e -> System.out.println(e));
		System.out.println(">3");
		ref.stream().filter(f->f>3).forEach(i->System.out.println(i));
		System.out.println("Array list");
		ref.stream().filter(a->a==5).forEach(m->System.out.println(m));
		System.out.println("for empty");
		List<Integer> eql =  ref.stream().filter(c->c==9).collect(Collectors.toList());
		System.out.println(eql);

//		System.out.println("Total:" + ref.size());
//		System.out.println(ref);
//		
//		System.out.println(ref.get(0));
//		ref.remove(3);
//		System.out.println("remove" +ref);
//		ref.contains(1);
//		System.out.println("contain" +ref);
//		
//		Iterator<Integer> itr = ref.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		ref.get(1);
//		System.out.println(ref);
//		
//		System.out.println("Remove All:" + ref.removeAll(ref));
//		System.out.println(ref);
	}

}
