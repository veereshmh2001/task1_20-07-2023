package com.xworkz.mapCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryRunner {

	public static void main(String[] args) {

		System.out.println("Invoking in Country Runner");

		CountryDTO country = new CountryDTO(1, "India");
		CountryDTO country2 = new CountryDTO(2, "China");
		CountryDTO country3 = new CountryDTO(1, "Russia");
		CountryDTO country4 = new CountryDTO(1, "SriLanka");
		CountryDTO country5 = new CountryDTO(1, "Pakistan");

		PresidentDTO president = new PresidentDTO(1, "Droupadi Murmu");
		PresidentDTO president2 = new PresidentDTO(1, "Chin");
		PresidentDTO president3 = new PresidentDTO(1, "Puttin");
		PresidentDTO president4 = new PresidentDTO(1, "Prajwal");
		PresidentDTO president5 = new PresidentDTO(1, "Rohan");

		Map<CountryDTO, PresidentDTO> countryAndPresidentMap = new HashMap<CountryDTO, PresidentDTO>();
		countryAndPresidentMap.put(country, president);
		countryAndPresidentMap.put(country2, president2);
		countryAndPresidentMap.put(country3, president3);
		countryAndPresidentMap.put(country4, president4);
		countryAndPresidentMap.put(country5, president5);

		System.out.println("--------------");

		countryAndPresidentMap.forEach((k, v) -> System.out.println(k + ":" + v));

		System.out.println("--------------");

		Set<Entry<CountryDTO, PresidentDTO>> ref = countryAndPresidentMap.entrySet();
		ref.forEach(p -> System.out.println(p));

		Iterator<Entry<CountryDTO, PresidentDTO>> itr = ref.iterator();
		while (itr.hasNext()) {
			Entry<CountryDTO, PresidentDTO> ref2 = itr.next();
			System.out.println(ref2);
			
			
		}

	}

}
