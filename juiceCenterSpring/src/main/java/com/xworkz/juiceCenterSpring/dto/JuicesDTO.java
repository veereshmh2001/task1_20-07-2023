package com.xworkz.juiceCenterSpring.dto;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class JuicesDTO {

	@NotNull()
	@Size(min = 3, max = 30, message = "name must be between 3 and 30 char")
	private String name;

	private String juices;

	private String total;

	@DecimalMin("1")
	@DecimalMax("1000")
	private String price;

}
