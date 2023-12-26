package com.xworkz.backUp.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class ApplicationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<ApplicationDTO> ref = new ArrayList<ApplicationDTO>();
		ref.add(new ApplicationDTO("insta", "new", "honor", LocalDate.of(2023, 10, 27), 1.1));

	}

}
