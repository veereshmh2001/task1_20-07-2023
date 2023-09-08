package com.xworkz.crud.app.runnre;

import com.xworkz.crud.app.reopsitory.MobileNoRepository;
import com.xworkz.crud.app.reopsitory.MobileNoRepositoryImpl;
import com.xworkz.crud.app.service.MobileNoService;
import com.xworkz.crud.app.service.MobileNoServiceImpl;

public class MobileNoRunner {

	public static void main(String[] args) {
		 System.out.println("Invoking main in MobileNoRunner");
		 
		 MobileNoRepository mobileNoRepository= new MobileNoRepositoryImpl();
		 MobileNoService mobileNoService= new MobileNoServiceImpl(mobileNoRepository);
		 
		 mobileNoService.validateAndSave(8660512953L);
		 mobileNoService.validateAndSave(8660512953L);

	}

}
