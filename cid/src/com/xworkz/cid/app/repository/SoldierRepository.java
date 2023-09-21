package com.xworkz.cid.app.repository;

import com.xworkz.cid.app.dto.SoldierDTO;

public interface SoldierRepository {
	
public final int TOTAL_VALUE=10;
	
	public void save(SoldierDTO dto);
	
	public boolean isExist(SoldierDTO dto);
	
	public SoldierDTO findByName(String name);

}
