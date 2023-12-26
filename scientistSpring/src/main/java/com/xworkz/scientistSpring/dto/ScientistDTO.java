package com.xworkz.scientistSpring.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ScientistDTO {
	
	@NotNull
	@Size(min = 3, max = 1000, message = "Name must be between 3 and 1000 characters")
	private String name;
	
	@NotNull(message = "Select any one field")
	@Size(min = 3, max = 1000, message = "Select any one field")
	private String field;
	
	@Min(2)
	@Max(50)
	private int experience;
	
	@NotNull(message = "Select any one field")
	@Size(min = 3, max = 1000, message = "Select any one field")
	private String country;
	
	@NotNull
	@Size(min = 3, max = 1000, message = "Achievment must be between 3 and 1000 characters")
	private String achievment;

}
