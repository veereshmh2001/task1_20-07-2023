package com.xworkz.crud.app.reopsitory;

public interface TrainNoRepository {
	
	int TOTAL_NUMBERS = 5;
	void save (String trainNumber);
	
	default boolean isExist(String trainNumber) {
		return false;
	}

}
