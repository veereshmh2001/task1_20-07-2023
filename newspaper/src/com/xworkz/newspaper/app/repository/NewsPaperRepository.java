package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.NewsPaperDTO;

public interface NewsPaperRepository {
	
	int TOTAL_ITEMS=5;
	
	void save (NewsPaperDTO dto);
	
	default boolean isExist(NewsPaperDTO dto) {
		return false;
	}
	
	default NewsPaperDTO findbyPublisher(String name) {
		return null;
	}
	
	
	

}
