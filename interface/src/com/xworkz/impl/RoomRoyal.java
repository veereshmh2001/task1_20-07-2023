package com.xworkz.impl;

import com.xworkz.app.RoomSafe;

public class RoomRoyal implements RoomSafe {
	

	@Override
	public int totalRooms() {
		System.out.println("invoking in Royal");
		return 0;
	}

	@Override
	public boolean electricity() {
		return false;
	}

}
