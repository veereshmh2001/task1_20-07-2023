package com.xworkz.newspaper.app.dto;

import java.io.Serializable;

public class AadharDTO implements Serializable{
	
	String name;
	int number;
	String state;
	String sex;
	
	public void name() {
		
	}

	public AadharDTO(String name, int number, String state, String sex) {
		super();
		this.name = name;
		this.number = number;
		this.state = state;
		this.sex = sex;
	}
	
	

	@Override
	public String toString() {
		return "AadharDTO [name=" + name + ", number=" + number + ", state=" + state + ", sex=" + sex + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	

}
