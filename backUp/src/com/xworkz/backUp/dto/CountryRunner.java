package com.xworkz.backUp.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CountryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<CountryDTO> ref = new ArrayList<CountryDTO>();
		ref.add(new CountryDTO(4, "India", "New Delhi", 1380004385, true, LocalDate.of(1947, 8, 15), 28, "Hinduism", "Bengal Tiger", "Peacock"));
		ref.add(new CountryDTO(2, "China", "Beijing", 1439323776, true, LocalDate.of(1949, 10, 1), 23, "Buddhism, Taoism, Atheism", "Giant Panda", "Red-crowned Crane"));
		ref.add(new CountryDTO(1, "United States", "Washington, D.C.", 331002651, true, LocalDate.of(1776, 7, 4), 50, "Christianity", "Bald Eagle", "Bald Eagle"));
		ref.add(new CountryDTO(3, "Pakistan", "Islamabad", 225199937, true, LocalDate.of(1947, 8, 14), 4, "Islam", "Markhor", "Chukar partridge"));
		ref.add(new CountryDTO(5, "Indonesia", "Jakarta", 273523615, true, LocalDate.of(1945, 8, 17), 34, "Islam", "Komodo Dragon", "Javan Hawk-Eagle"));
		
		
		
		
		/*
		 * for(CountryDTO countryDTO:ref) {
		 * if(countryDTO.getName().equalsIgnoreCase("india")){
		 * countryDTO.setCapitalCity("Hubballi"); } }
		 */
		//Collections.sort(ref);
		//ref.forEach(e -> System.out.println(e));
		//ref.forEach(e -> System.out.println(e));
		
		//ref.stream().forEach(e -> System.out.println(e.getName()));
		
		//ref.stream().filter(e -> e.getId()>2).forEach(e -> System.out.println(e));
		
		//Stream<CountryDTO> dto= ref.stream().filter(s -> s.getId()==5 && s.getName().equalsIgnoreCase("Indonesia"));
		//List<CountryDTO> data= dto.collect(Collectors.toList());
		//data.forEach(s -> System.out.println(s));
				CountryDTO dto = new CountryDTO(1, "United States", "Washington, D.C.", 331002651, true, LocalDate.of(1776, 7, 4), 50, "Christianity", "Bald Eagle", "Bald Eagle");
				CountryDTO dto1 =new CountryDTO(2, "China", "Beijing", 1439323776, true, LocalDate.of(1949, 10, 1), 23, "Buddhism, Taoism, Atheism", "Giant Panda", "Red-crowned Crane");
				boolean na=dto.equals(dto1);
				System.out.println(na);
	}

}
