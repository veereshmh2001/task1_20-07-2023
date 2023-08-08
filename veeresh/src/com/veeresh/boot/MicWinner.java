package com.veeresh.boot;

import com.veeresh.app.Mic;
import com.veeresh.app.MicConcert;

public class MicWinner {
	public static void main(String[] args) {
		System.out.println("invoking main in micwinner");
		
		Mic mic = new MicConcert();
		mic.singer();
	}

}
