package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.NewsPaperDTO;

public class NewsPaperRepositoryImpl implements NewsPaperRepository {

	private NewsPaperDTO[] dtos = new NewsPaperDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(NewsPaperDTO dto) {
		System.out.println("invoking save in NewsPaperRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.dtos[position] = dto;
			System.out.println(dto + " is saved at position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is full");
		}

	}
	
	@Override
	public boolean isExist(NewsPaperDTO dto) {
		
		System.out.println("running is exist in " + this.getClass().getSimpleName());
		for(int index = 0; index<= this.position; index++) {
			NewsPaperDTO ref = this.dtos[index];
			if(ref!=null && ref.equals(dto)) {
				System.out.println("dto already exist");
				return true;
			}
		}
		return NewsPaperRepository.super.isExist(dto);
	}
	
	@Override
	public NewsPaperDTO findbyPublisher(String name) {
		
		System.out.println("running findbyPublisher arg passed " + name);
		System.out.println("current position " + this.position);
		for(int index = 0; index< this.position; index++) {
			NewsPaperDTO dto = this.dtos[index];
			if(dto.getPublisher().equals(name)) {
				System.out.println("dto found with publisher");
				return dto;
			}
		}
		System.err.println("No dto matched");
		return NewsPaperRepository.super.findbyPublisher(name);
	}

}

