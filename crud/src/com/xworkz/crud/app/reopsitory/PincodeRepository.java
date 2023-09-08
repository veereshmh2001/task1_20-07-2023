package com.xworkz.crud.app.reopsitory;

public interface PincodeRepository {

	int TOTAL_PINCODES = 1000;

	void save(int pincode);

	default boolean isExist(int pincode) {
		return false;
	}

}
