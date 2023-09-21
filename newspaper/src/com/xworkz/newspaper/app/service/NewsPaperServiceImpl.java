package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.NewsPaperDTO;
import com.xworkz.newspaper.app.repository.NewsPaperRepository;

public class NewsPaperServiceImpl implements NewsPaperService {

	private NewsPaperRepository newsPaperRepository;

	public NewsPaperServiceImpl(NewsPaperRepository newsPaperRepository) {
		this.newsPaperRepository = newsPaperRepository;
	}

	@Override
	public boolean validateAndSave(NewsPaperDTO dto) {

		System.out.println("invoking validate and save in newspaper service Impl");
		if (dto != null) {
			System.out.println("dto is valid " + this.getClass().getSimpleName());
			String name = dto.getName();
			String publisher = dto.getPublisher();
			double cost = dto.getCost();
			int pages = dto.getPages();
			if (name != null && !name.isEmpty() && name.length() >= 5 && name.length() <= 20) {
				System.out.println("Name is valid");

			} else {
				System.err.println("Name is not valid");
			}
			if (publisher != null && !publisher.isEmpty() && publisher.length() >= 5 && publisher.length() <= 20) {
				System.out.println("publisher is valid");
			} else {
				System.err.println("publisher is not valid");
			}

			if (cost > 0 && pages > 0) {
				System.out.println("cost & pages are valid");
			} else {
				System.err.println("cost & pages are invalid");
			}
			this.newsPaperRepository.save(dto);
			return true;
		} else {
			System.err.println("dto is invalid");
		}

		return false;
	}

	@Override
	public NewsPaperDTO findbyPublisher(String name) {
		
		System.out.println("running in findby.....");
		if(name!=null && !name.isEmpty() && name.length()>=2 && name.length()<20) {
			System.out.println("publisher is valid, will find");
			NewsPaperDTO dto = this.newsPaperRepository.findbyPublisher(name);
			return dto;
		} else {
			System.err.println("publisher is invalid...");
		}
		return NewsPaperService.super.findbyPublisher(name);
	}
	
	
	

}
