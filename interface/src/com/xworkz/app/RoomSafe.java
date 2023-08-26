package com.xworkz.app;

public interface RoomSafe extends RoomSale, RoomRule {
	
	public int totalRooms();
	public boolean electricity();

}
