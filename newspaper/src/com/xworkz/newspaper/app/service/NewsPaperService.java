package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.NewsPaperDTO;

public interface NewsPaperService {
	
	boolean validateAndSave(NewsPaperDTO dto);

	default NewsPaperDTO findbyPublisher(String name) {
		return null;
	}

}
