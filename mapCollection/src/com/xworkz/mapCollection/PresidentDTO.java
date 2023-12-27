package com.xworkz.mapCollection;

import java.io.Serializable;

public class PresidentDTO implements Serializable,Comparable<PresidentDTO>{
	
	private int id;
	private String name;
	
	public PresidentDTO() {
		// TODO Auto-generated constructor stub
	}

	public PresidentDTO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		PresidentDTO other = (PresidentDTO) obj;
		if (id != other.id)
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
		return "PresidentDTO [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(PresidentDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}