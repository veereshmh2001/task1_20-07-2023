package com.xworkz.crud.app.impl;

import com.xworkz.crud.app.reopsitory.Pilot;

public class PilotImpl implements Pilot {

	private String[] pilots = new String[TOTAL_ITEMS];
	int position;

	@Override
	public void addPilot(String pilotName) {

		System.out.println("Invoking addPilot in PilotImpl...");

		if (this.position < TOTAL_ITEMS) {
			this.pilots[position] = pilotName;
			System.out.println("Stored " + pilotName + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is Full, cannot store pilot...");
		}

	}

}
