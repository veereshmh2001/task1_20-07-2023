package com.xworkz.crud.app.reopsitory;

public interface LocationRepository {

	int TOTAL_LOCATIONS = 6;

	void place(String area);

	default boolean isExist(String area) {
		return false;
	}

}
