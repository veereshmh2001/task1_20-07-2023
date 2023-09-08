package com.xworkz.newspaper.runner;

import com.xworkz.newspaper.app.dto.NewsPaperDTO;
import com.xworkz.newspaper.app.repository.NewsPaperRepository;
import com.xworkz.newspaper.app.repository.NewsPaperRepositoryImpl;
import com.xworkz.newspaper.app.service.NewsPaperService;
import com.xworkz.newspaper.app.service.NewsPaperServiceImpl;

public class NewsPaperRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking main in runner");
		
		NewsPaperRepository newsPaperRepository = new NewsPaperRepositoryImpl();
		NewsPaperService newsPaperService = new NewsPaperServiceImpl(newsPaperRepository);
		
		NewsPaperDTO dto = new NewsPaperDTO();
		boolean persisted = newsPaperService.validateAndSave(dto);
		System.out.println("Persisted : " + persisted);

	}

}
