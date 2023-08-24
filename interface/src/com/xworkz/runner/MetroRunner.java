package com.xworkz.runner;

import com.xworkz.app.Metro;
import com.xworkz.impl.MetroExpress;

public class MetroRunner {

	public static void main(String[] args) {
		
		Metro metro = new MetroExpress();
		metro.city();
		metro.line();
		metro.stations();
		

	}

}
