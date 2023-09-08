package com.xworkz.crud.app.reopsitory;

public interface CountryRepository {
	
	int TOTAL_COUNTRIES=11;
	void store (String countryName);
	
	default boolean isExist (String countryName) {
		System.out.println("defalt impl in interface, will always be false");
		return false;
	}

}
