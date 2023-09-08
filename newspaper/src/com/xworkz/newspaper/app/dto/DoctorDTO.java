package com.xworkz.newspaper.app.dto;

import java.io.Serializable;

public class DoctorDTO implements Serializable {
	
	private String name;
	private String hospital;
	private int experince;
	private boolean available;
	
	public void name() {
		
	}

	public DoctorDTO(String name, String hospital, int experince, boolean available) {
		super();
		this.name = name;
		this.hospital = hospital;
		this.experince = experince;
		this.available = available;
	}

	@Override
	public String toString() {
		return "DoctorDTO [name=" + name + ", hospital=" + hospital + ", experince=" + experince + ", available="
				+ available + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public int getExperince() {
		return experince;
	}

	public void setExperince(int experince) {
		this.experince = experince;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	

}
