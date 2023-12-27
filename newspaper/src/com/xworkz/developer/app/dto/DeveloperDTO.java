package com.xworkz.developer.app.dto;

import java.io.Serializable;

public class DeveloperDTO implements Serializable {

	private String name;
	private int experience;
	private double salary;
	private String workingFor;
	private String designation;
	private boolean difficult;

	public DeveloperDTO() {

	}

	public DeveloperDTO(String name, int experience, double salary, String workingFor, String designation,
			boolean difficult) {
		super();
		this.name = name;
		this.experience = experience;
		this.salary = salary;
		this.workingFor = workingFor;
		this.designation = designation;
		this.difficult = difficult;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			if (obj instanceof DeveloperDTO) {
				
				DeveloperDTO F = (DeveloperDTO) obj;
				if (F.designation.equals(this.designation)) {
					System.err.println("The designation name is already stored");// if it is same it will be true...
					return true;
				} else {
					System.out.println("It can Store it as desigation value is change");// it will be false

				}
			}
		}
		return false;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getWorkingFor() {
		return workingFor;
	}

	public void setWorkingFor(String workingFor) {
		this.workingFor = workingFor;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public boolean isDifficult() {
		return difficult;
	}

	public void setDifficult(boolean difficult) {
		this.difficult = difficult;
	}

	@Override
	public String toString() {
		return "DeveloperDTO [name=" + name + ", experience=" + experience + ", salary=" + salary + ", workingFor="
				+ workingFor + ", designation=" + designation + ", difficult=" + difficult + "]";
	}

}