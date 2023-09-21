package com.xworkz.cid.app.repository;

import com.xworkz.cid.app.dto.SoldierDTO;


public class SoldierRepositoryImpl implements SoldierRepository {
	
	SoldierDTO[] dto=new SoldierDTO[TOTAL_VALUE];
	int pos;

	@Override
	public void save(SoldierDTO dto) {
		
		if(pos<TOTAL_VALUE)
		{
			this.dto[pos]=dto;
			System.out.println(dto+" "+pos);
			pos++;
		}

	}

	@Override
	public boolean isExist(SoldierDTO dto) {
		
		for(int i=0;i<=this.pos;i++)
		{
			SoldierDTO temp=this.dto[i];
			if(temp!=null &&temp.equals(dto))
			{
				System.err.println("It can not store because it is having equal value");
				return true;
			}
		}
		
		return false;
	}

	@Override
	public SoldierDTO findByName(String name) {
		
		for(int i=0;i<=pos;i++)
		{
			SoldierDTO ref=dto[i];
			if(ref.getName().equals(name))
			{
				System.out.println("It has found on position="+i);
				return ref;
			}else {
				System.err.println("It is not found");
			}
		}
		
		return null;
	}

}
