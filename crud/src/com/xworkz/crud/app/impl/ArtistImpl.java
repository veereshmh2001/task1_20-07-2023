package com.xworkz.crud.app.impl;

import com.xworkz.crud.app.reopsitory.Artist;

public class ArtistImpl implements Artist {
	
	private String[] artist = new String[TOTAL_ARTISTS];
	int position;

	@Override
	public void save(String artist) {
		 System.out.println("Invoking save in ArtistImpl...");

	        if (this.position < TOTAL_ARTISTS) {
	            this.artist[position] = artist;
	            System.out.println("Stored " + artist + " in position " + this.position);
	            this.position++;
	        } else {
	            System.err.println("Storage is full, cannot store artist...");
	        }
		
	

	}

}
