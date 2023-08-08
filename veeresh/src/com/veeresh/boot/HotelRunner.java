package com.veeresh.boot;

import com.veeresh.app.Hotel;

public class HotelRunner {
public static void main(String[] args) {
	
	Hotel hotel = new Hotel();
	hotel.service();
	hotel.service("Grand Plaza","City Center",150,4.5);
	
}
}
