package com.xworkz.backUp.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Runner {

	public static void main(String[] args) {
		Collection<InstituteDTO> ref = new ArrayList<InstituteDTO>();
		ref.add(new InstituteDTO(1, "Xworkz", "Rajajimagar", "karnataka", "bengaluru"));
		ref.add(new InstituteDTO(2, "jSpider", "BTM", "karnataka", "bengaluru"));
		ref.add(new InstituteDTO(3, "codenest", "basavanagar", "karnataka", "bengaluru"));

		for (InstituteDTO instituteDTO : ref) {
			if (instituteDTO.getName().equalsIgnoreCase("xworkz")) {
				instituteDTO.setState("hydrabad");
				
			}
		}
		//ref.forEach(e -> System.out.println(e));
		
		//ref.stream().forEach(e -> System.out.println(e.getName()));
		
		//ref.stream().filter(e -> e.getId()>1).forEach(e -> System.out.println(e));
		
		Stream<InstituteDTO> filterList= ref.stream().filter(e-> e.getId()==2 && e.getName().equalsIgnoreCase("jSpider"));
		List<InstituteDTO> data= filterList.collect(Collectors.toList());
		data.forEach(r-> System.out.println(r));

	}

}
