package com.xworkz.backUp.dto;

import java.util.Comparator;

public class NameComparator implements Comparator<CountryDTO>{

	@Override
	public int compare(CountryDTO dto, CountryDTO dto2) {
		// TODO Auto-generated method stub
		System.out.println("running in comparator");
		return dto.getName().compareToIgnoreCase(dto.getName());
	}
	
	

}
