package com.xworkz.app.equals;

public class Ceo {
	
	private String name;
    private int age;
    private String company;
    private double salary;
    private int yearsInPosition;
    private boolean isFounder;
	
    
    public Ceo() {
		
	}


	public Ceo(String name, int age, String company, double salary, int yearsInPosition, boolean isFounder) {
		super();
		this.name = name;
		this.age = age;
		this.company = company;
		this.salary = salary;
		this.yearsInPosition = yearsInPosition;
		this.isFounder = isFounder;
	}
    
    @Override
    public String toString() {
    	
    	return "Name : " + this.name+ "," + " Age : " + this.age + "," + "Company : " + this.company+ "," + "Salary : " + this.salary+ "," + "Years in Position : " + this.yearsInPosition+ "," + "Is Founder : " + this.isFounder;
    }
    
    @Override
    public boolean equals(Object obj) {
    	System.out.println("invoking in Ceo Company");
    	
    	if(obj!= null) {
    		System.out.println("invoking in null");
    		if(obj instanceof Ceo) {
    			System.out.println("invoking in instanceof ceo");
    			Ceo casted = (Ceo)obj;
    			Ceo currentInstance = this;
    			if(currentInstance.name==casted.name&& currentInstance.age==casted.age&& currentInstance.company==casted.company) {
    				System.out.println("All are same");
    				return true;
    			}
    			else {
    				System.err.println("They are not same");
    			}
    		}
    	}
    	else {
    		System.err.println("error in null");
    	}
    	return false;
    }

}
