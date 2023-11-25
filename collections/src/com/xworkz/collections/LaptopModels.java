package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LaptopModels {
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList();
		collection.add("Dell XPS 13");
		collection.add("Acer Aspire 5");
		collection.add("HP Spectre x360");
		collection.add("Lenovo ThinkPad X1 Carbon");
		collection.add("MacBook Air");
		collection.add("ASUS ROG Zephyrus G14");
		collection.add("Microsoft Surface Laptop 4");
		collection.add("Razer Blade 15");
		collection.add("MSI GS66 Stealth");
		collection.add("LG Gram 17");
		collection.add("Lenovo Yoga C940");
		collection.add("HP Envy x360");
		collection.add("Dell Inspiron 15");
		collection.add("Acer Predator Helios 300");
		collection.add("ASUS VivoBook S15");
		collection.add("MacBook Pro");
		collection.add("Microsoft Surface Book 3");
		collection.add("Lenovo Legion 5");
		collection.add("HP Omen 15");
		collection.add("ASUS TUF Gaming A15");
		collection.add("Dell Latitude 7400");
		collection.add("MSI Prestige 14");
		collection.add("LG Gram 15");
		collection.add("Acer Swift 3");
		collection.add("Lenovo IdeaPad 3");
		collection.add("Dell G5 15");
		collection.add("HP Pavilion x360");
		collection.add("ASUS ZenBook 14");
		collection.add("MacBook Pro M1");
		collection.add("Microsoft Surface Pro 7");
		collection.add("Razer Blade Pro 17");
		collection.add("MSI Creator 15");
		collection.add("Lenovo");
		collection.add("Acer Swift 3");
		collection.add("Google Pixelbook Go");
		collection.add("MSI Prestige 14");
		collection.add("Razer Blade Pro 17");
		collection.add("Alienware Area-51m");
		collection.add("HP ZBook Fury");
		collection.add("Lenovo Chromebook Duet");
		collection.add("Acer Chromebook Spin 713");
		collection.add("Dell G3 15");
		collection.add("Asus ROG Zephyrus M16");
		collection.add("Apple MacBook Air M2");
		collection.add("Lenovo IdeaPad 3");
		collection.add("Dell XPS 15");
		collection.add("HP Pavilion x360");
		collection.add("Acer Nitro 5");
		collection.add("Lenovo ThinkPad X1 Yoga");
		collection.add("Asus ZenBook 14");
		collection.add("Razer Blade Stealth");
		
		System.out.println("Total Models : " + collection.size());
		
		Iterator<String> itr = collection.iterator();

		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println("Model : " + name);
		}
	}

}
