package com.xworkz.backUp.dto;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRunner {

	public static void main(String[] args) {
		List<Integer> ref = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());
		ref.forEach(e -> System.out.println(e));
		System.out.println("Size" +ref.size());
		
		
		

	}

}
