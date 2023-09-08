package com.xworkz.crud.app.reopsitory;

public interface JuiceRepository {
	int TOTAL_ITEMS=10;
	void store(String juice);
	
	default boolean isExist (String juice) {
		System.out.println("defalt impl in interface, will always be false");
		return false;
	}
 
}
