package com.xworkz.crud.app.reopsitory;

public interface MobileNoRepository {
	
	  int TOTAL_MOBILE_NUMBERS = 10;

	    void save(long mobileNumber);

	    default boolean isExist(long mobileNumber) {
	        return false;
	    }

}
