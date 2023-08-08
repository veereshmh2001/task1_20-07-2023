package com.veeresh.boot;

import com.veeresh.app.Theater;
import com.veeresh.app.TheaterView;

public class TheaterKiller {
	public static void main(String[] args) {
		System.out.println("invoking main in theater");
	
	
	Theater theater = new TheaterView();
	theater.housefull();
	}
}
