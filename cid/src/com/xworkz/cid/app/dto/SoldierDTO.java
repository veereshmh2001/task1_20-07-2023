package com.xworkz.cid.app.dto;

import java.io.Serializable;

public class SoldierDTO implements Serializable {
	
	private String name;
    private int age;
    private String rank;
    private String unit;
    private double height;
    private double weight;
    private boolean isAlive;
    private boolean isDeployed;
    private int yearsOfService;
    private String specialTraining;
    
    public SoldierDTO() {
    	
    	
	}

	public SoldierDTO(String name, int age, String rank, String unit, double height, double weight, boolean isAlive,
			boolean isDeployed, int yearsOfService, String specialTraining) {
		super();
		this.name = name;
		this.age = age;
		this.rank = rank;
		this.unit = unit;
		this.height = height;
		this.weight = weight;
		this.isAlive = isAlive;
		this.isDeployed = isDeployed;
		this.yearsOfService = yearsOfService;
		this.specialTraining = specialTraining;
	}
    
    @Override
    public boolean equals(Object obj) {
    	
    	System.out.println("running equals in SoldierDTO");
		if(obj!=null)
		{
			if(obj instanceof SoldierDTO)
			{
				SoldierDTO casted=(SoldierDTO)obj;
				if(this.name.equals(casted.name)&& this.rank.equals(casted.rank))
				{
					System.out.println("Instance are same");
					return true;
				}
			}
		}
    	return super.equals(obj);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public boolean isDeployed() {
		return isDeployed;
	}

	public void setDeployed(boolean isDeployed) {
		this.isDeployed = isDeployed;
	}

	public int getYearsOfService() {
		return yearsOfService;
	}

	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}

	public String getSpecialTraining() {
		return specialTraining;
	}

	public void setSpecialTraining(String specialTraining) {
		this.specialTraining = specialTraining;
	}

	@Override
	public String toString() {
		return "SoldierDTO [name=" + name + ", age=" + age + ", rank=" + rank + ", unit=" + unit + ", height=" + height
				+ ", weight=" + weight + ", isAlive=" + isAlive + ", isDeployed=" + isDeployed + ", yearsOfService="
				+ yearsOfService + ", specialTraining=" + specialTraining + "]";
	}
    
    

}
