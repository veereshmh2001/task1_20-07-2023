package com.xworkz.mapCollection;

import java.io.Serializable;

public class CompanyDTO implements Serializable,Comparable<CompanyDTO> {
	
	private String name;
	private String location;
	private Long gstNumber;
	
	
	public CompanyDTO() {
		// TODO Auto-generated constructor stub
	}


	public CompanyDTO(String name, String location, Long gstNumber) {
		super();
		this.name = name;
		this.location = location;
		this.gstNumber = gstNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Long getGstNumber() {
		return gstNumber;
	}


	public void setGstNumber(Long gstNumber) {
		this.gstNumber = gstNumber;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gstNumber == null) ? 0 : gstNumber.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompanyDTO other = (CompanyDTO) obj;
		if (gstNumber == null) {
			if (other.gstNumber != null)
				return false;
		} else if (!gstNumber.equals(other.gstNumber))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "CompanyDTO [name=" + name + ", location=" + location + ", gstNumber=" + gstNumber + "]";
	}


	@Override
	public int compareTo(CompanyDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
