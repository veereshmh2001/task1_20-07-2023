package com.xworkz.crud.app.reopsitory;

public class LocationRepositoryImpl implements LocationRepository {

	private String[] locations = new String[TOTAL_LOCATIONS];
	private int position = 0;

	@Override
	public void place(String area) {
		System.out.println("invoking locations from Repository " + this.getClass().getSimpleName());
		if (position < TOTAL_LOCATIONS) {
			this.locations[position] = area;
			System.out.println("Location is " + area + "place");
			this.position++;

		} else {
			System.err.println("area is not avalaible");
		}

	}

	@Override
	public boolean isExist(String area) {
		for (int i = 0; i <= position; i++) {
			String temp = this.locations[i];
			if (temp != null && temp.equals(area)) {
				System.out.println("already exist");
				return true;
			}
		}

		return false;
	}

}
