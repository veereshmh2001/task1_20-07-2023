package com.veeresh.boot;

import com.veeresh.app.Amoeba;
import com.veeresh.app.AmoebaWaste;

public class AmoebaKiller {
	public static void main(String[] args) {
		System.out.println("invoking main in AmoebaKiller");
		
		Amoeba amoeba = new AmoebaWaste();
		amoeba.fluid();
	}

}
