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

}

