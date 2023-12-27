package com.xworkz.bankSpring.dto;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class BankDTO {
	@NotNull
	@Size(min = 3,max = 50,message = "First Name must be between 3 and 50 characters")
	private String fname;
	
	@NotNull
	@Size(min = 3,max = 50,message = "Middle Name must be between 3 and 50 characters")
	private String mname;
	
	@NotNull
	@Size(min = 3,max = 50,message = "Last Name must be between 3 and 50 characters")
	private String lname;
	
	@Min(1)
	@Max(10)
	private long mobile;
	
	@Min(1)
	@Max(14)
	private long aadhar;
	
	@NotNull
	@Size(min = 3,max = 20,message = "Email must be between 3 and 20 characters")
	private String email;
	
	@NotNull(message = "Select the date")
	private LocalDate dob;
	
	@NotNull
	@Size(min = 3,max = 50,message = "Address must be between 3 and 50 characters")
	private String address;
	
	@NotNull(message = "Select any State")
	@Size(min = 3,max = 10,message = "Select any State")
	private String state;
	

}
