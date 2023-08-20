package com.xworkz.app.equals;

public class Mechanic {
	
	private String name;
    private int age;
    private String specialization;
    private String address;
    private String phoneNumber;
    private boolean isCertified;
	
    
    public Mechanic() {
		super();
	}


	public Mechanic(String name, int age, String specialization, String address, String phoneNumber,
			boolean isCertified) {
		super();
		this.name = name;
		this.age = age;
		this.specialization = specialization;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.isCertified = isCertified;
	}
    
	@Override
	public String toString() {
		
		return "Name : " + this.name+ "," + " Age : " + this.age + "," + "Specialization : " + this.specialization+ "," + "Address : " + this.address+ "," + "PhoneNumber : " + this.phoneNumber+ "," + "Is Certified : " + this.isCertified;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking in Mechanic");

		if (obj != null) {
			System.out.println("invoking in null");
			if (obj instanceof Mechanic) {
				System.out.println("invoking in instanceof Mechanic");
				Mechanic casted = (Mechanic) obj;
				Mechanic currentInstance = this;
				if (currentInstance.name == casted.name && currentInstance.age == casted.age
						&& currentInstance.specialization == casted.specialization
						&& currentInstance.address == casted.address && currentInstance.phoneNumber==casted.phoneNumber) {
					System.out.println("All are same");
					return true;
				} else {
					System.err.println("They are not same");
				}
			}
		} else {
			System.err.println("error in null");
		}
		return false;
	}

}
