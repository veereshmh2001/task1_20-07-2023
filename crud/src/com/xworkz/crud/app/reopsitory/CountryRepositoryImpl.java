package com.xworkz.crud.app.reopsitory;

public class CountryRepositoryImpl implements CountryRepository {

	private String[] countries = new String[TOTAL_COUNTRIES];
	private int position = 0;

	@Override
	public void store(String countryName) {
		System.out.println("invoking store from Country Repository " + this.getClass().getSimpleName());
		if (position < TOTAL_COUNTRIES) {

			this.countries[position] = countryName;
			System.out.println("Country is " + countryName + "store");
			this.position++;

		}else {
			System.err.println("Storage is full");
		}

	}
	
	@Override 
	public boolean isExist(String countryName) {
		for(int i=0; i<=this.position;i++) {
			String temp=this.countries[i];
			if(temp!=null && temp.equals(countryName)) {
				System.out.println("alreday exist");
				return true;
			}
			
		}
		return false;
	}

}
