package com.xworkz.findby.app.repository;

import com.xworkz.findby.app.dto.EngineerDTO;



public class EngineerRepositoryImpl implements EngineerRepository {

	private EngineerDTO[] dtos = new EngineerDTO[TOTAL_ITEMS];
	private int position;
	private EngineerDTO dto;

	@Override
	public void save(EngineerDTO dto) {

		System.out.println("invoking save in EngineerRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.dtos[position] = dto;
			System.out.println(dto + " is saved at position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is full");
		}

	}
	
	@Override
	public boolean isExist(EngineerDTO dto) {
		System.out.println("running is exist in " + this.getClass().getSimpleName());
		for(int index = 0; index<= this.position; index++) {
			EngineerDTO ref = this.dtos[index];
			if(ref!=null && ref.equals(dto)) {
				System.out.println("dto already exist");
				return true;
			}
		}
		
		return EngineerRepository.super.isExist(dto);
	}
	
	
	@Override
	public EngineerDTO findbyNameAndCollegeNameAndId(String name, String collegeName,int id) {
		
		System.out.println("running findbyName arg passed " + name);
		System.out.println("current position " + this.position);
		for(int index = 0; index< this.position; index++) {
			dto = this.dtos[index];
			if(dto.getName().equals(name) && dto.getCollegeName().equals(collegeName) && dto.getId()==id) {
				System.out.println("dto matched");
				return dto;
			}
		}
		System.err.println("No dto matched");
		return EngineerRepository.super.findbyName(name);
	}
	
	

}
