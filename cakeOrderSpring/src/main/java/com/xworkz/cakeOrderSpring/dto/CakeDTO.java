package com.xworkz.cakeOrderSpring.dto;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CakeDTO {
	@NotNull()
	@Size(min=3,max=30,message="name must be between 3 and 30 char")
	private String name;
	@Email
	private String email;
	@NotNull()
	@Size(min=3,max=30,message="flavour must be between 3 and 30 char")
	private String flavour;
	@NotNull()
	@Size(min=3,max=30,message="weight must be between 3 and 30 char")
	private String weight;
	@DecimalMin("1")
	@DecimalMax("1000")
	private double price;
	
	private boolean takeAway;

}
