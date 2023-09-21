package com.xworkz.developer.app.util;

import java.util.Optional;

public class Garageutil {
	
	public static Optional<String> getName (String fName,String lName){
		if(fName!=null && lName!=null) {
			System.out.println("not empty");
			return Optional.of(fName+ " "+ lName);
		}else {
			System.err.println("null...");
			return Optional.empty();
		}
		
	}

}
