package com.xworkz.cid.app.service;

import com.xworkz.cid.app.dto.SoldierDTO;
import com.xworkz.cid.app.repository.SoldierRepository;
import com.xworkz.cid.app.repository.SoldierRepositoryImpl;
import com.xworkz.cid.app.runner.SoldierService;
import com.xworkz.cid.app.runner.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {
		
		SoldierRepository ref= new SoldierRepositoryImpl();
		SoldierService ref1= new SoldierServiceImpl();
		SoldierDTO ref2=new SoldierDTO("veeru", 25, "captain", "engg", 6.0, 60, true, true, 15, "para");
		SoldierDTO ref3=new SoldierDTO("veeru", 25, "captain", "engg", 6.0, 60, true, true, 15, "para");
		ref1.validateAndSave(ref2);
		ref1.validateAndSave(ref3);

	}

}
