package com.xworkz.runner;

import com.xworkz.app.Temple;
import com.xworkz.impl.TempleVisit;

public class TempleRunner {

	public static void main(String[] args) {
		Temple temple= new TempleVisit();
		temple.templeName(0);
		temple.location(0);
		temple.visitors(null);

	}

}
