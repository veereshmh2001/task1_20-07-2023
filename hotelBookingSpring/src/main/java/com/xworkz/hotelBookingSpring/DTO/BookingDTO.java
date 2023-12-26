package com.xworkz.hotelBookingSpring.DTO;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class BookingDTO {
	@NotNull()
	@Size(min=3,max=30,message="City must be between 3 and 30 char")
	
	private String city;
	
	private int pincode;
	@NotNull()
	@Size(min=3,max=30,message="Name must be between 3 and 30 char")
	private String name;
	@Min(1)
	@Max(50)
	private int rooms;
	@NotNull()
	@Size(min=3,max=30,message="Available must be between 3 and 30 char")
	private String available;
	@NotNull()
	@Size(min=3,max=30,message="Room Type must be between 3 and 30 char")
	private String roomType;
	@NotNull()
	@Size(min=3,max=30,message="Payment must be between 3 and 30 char")
	private String payment;
}
