package com.xworkz.laptop.boot;

import com.xworkz.laptop.app.Laptop;
import com.xworkz.laptop.app.Processor;

public class LaptopRunner {

	public static void main(String[] args) {
		
		
			System.out.println("Invoking main in LaptopMaker....");
			String brand = "Dell";

			Processor processor = new Processor();

			Laptop lap = new Laptop(brand);
			System.out.println("Laptop brand: " + brand);
			lap.setProcessor(processor);
			lap.browseInternet();
			lap.turnOn();
			lap.watchMovie();
			lap.shutdown();
		

	}

}
