package com.xworkz.newspaper.runner;

import java.util.Optional;

import com.xworkz.developer.app.util.Garageutil;

public class GarageRunner {

	public static void main(String[] args) {
		
		Optional<String> optional=Garageutil.getName("Sachin", "Tendulkar");
		if(optional.isPresent()) {
			
			String ref=optional.get();
			System.out.println(ref);
		}else {
			System.err.println("is empty");
		}
		

	}

}
