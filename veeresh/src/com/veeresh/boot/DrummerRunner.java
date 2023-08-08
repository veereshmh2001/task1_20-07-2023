package com.veeresh.boot;

import com.veeresh.app.Drummer;
import com.veeresh.app.DrummerVolume;

public class DrummerRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in drummerRunner");
		
		Drummer drummer = new DrummerVolume();
		drummer.sound();
	}

}
