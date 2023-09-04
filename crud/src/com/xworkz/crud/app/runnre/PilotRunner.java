package com.xworkz.crud.app.runnre;

import com.xworkz.crud.app.impl.PilotImpl;
import com.xworkz.crud.app.reopsitory.Pilot;

public class PilotRunner {

	public static void main(String[] args) {

		System.out.println("Invoking main in PilotRunner...");

		Pilot repo = new PilotImpl();
		repo.addPilot("Amelia Earhart");
		repo.addPilot("Wright Brothers");
		repo.addPilot("Robertson");
		repo.addPilot("Chuck Yeager");
		repo.addPilot("Sunita Williams");
		repo.addPilot("Kalpana Chawla");
		repo.addPilot("JRD Tata");
		repo.addPilot("Neil Armstrong");
		repo.addPilot("Yuri Gagarin");
		repo.addPilot("Valentina Tereshkova");
		repo.addPilot("Bessie Coleman");

	}

}
