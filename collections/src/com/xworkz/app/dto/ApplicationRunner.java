package com.xworkz.app.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ApplicationRunner {

	public static void main(String[] args) {
		
		System.out.println("Running main in ApplicationRunner");
		
		
		LocalDate date= LocalDate.of(2023, 10, 27);
		LocalDate date1= LocalDate.of(2023, 10, 28);
		LocalDate date2= LocalDate.of(2023, 10, 29);
		LocalDate date3= LocalDate.of(2023, 10, 22);
		LocalDate date4= LocalDate.of(2023, 10, 23);
		System.out.println(date);
		
		ApplicationDTO app = new ApplicationDTO();
		ApplicationDTO app1 = new ApplicationDTO("insta", "new", "honor", date, 1.1);
		ApplicationDTO app2 = new ApplicationDTO("whatsapp", "old", "MI", date, 1.2);
		ApplicationDTO app3 = new ApplicationDTO("snap", "2.1", "samsung", date, 1.3);
		ApplicationDTO app4 = new ApplicationDTO("telegram", "2'2", "oppo", date, 1.22);
		
		System.out.println(app);
		
		
		Collection<ApplicationDTO> collection=new ArrayList();
		collection.add(app4);
		collection.add(app3);
		collection.add(app2);
		collection.add(app1);
		
		System.out.println("Total : " + collection.size());
		
		Iterator<ApplicationDTO> itr = collection.iterator();
		while (itr.hasNext()) {
			ApplicationDTO applicationDTO = itr.next();
			System.out.println("Names : " + applicationDTO.getName());
		}
		
		
		

		

	}

}
