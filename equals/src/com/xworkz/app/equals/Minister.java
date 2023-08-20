package com.xworkz.app.equals;

public class Minister {
	
	private String name;
    private int age;
    private String portfolio;
    private String party;
    private int yearsInOffice;
    private boolean isCurrent;
    
    
	public Minister() {
		
	}


	public Minister(String name, int age, String portfolio, String party, int yearsInOffice, boolean isCurrent) {
		super();
		this.name = name;
		this.age = age;
		this.portfolio = portfolio;
		this.party = party;
		this.yearsInOffice = yearsInOffice;
		this.isCurrent = isCurrent;
	}
	
	@Override
	public String toString() {
		
		return "Name : " + this.name+ "," + " Age : " + this.age + "," + "Portfolio : " + this.portfolio+ "," + "Party : " + this.party+ "," + "Years in Office : " + this.yearsInOffice+ "," + "Is current : " + this.isCurrent;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("invoking in Minister");
		
		if(obj !=null) {
			System.out.println("invoking in null");
			
			if(obj instanceof Minister) {
				System.out.println("invoking in instanceof");
				Minister casted = (Minister)obj;
				Minister currentInstance=this;
				if(currentInstance.name==casted.name && currentInstance.age==casted.age) {
					System.out.println("name and age are same");
					return true;
				}
				else {
					System.err.println("not same");
				}
			}
		}
		else {
			System.err.println("error in null");
		}
		
		return false;
	}
    
    

}
