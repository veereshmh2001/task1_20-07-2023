class Bureau{
	
	 static String name;
     static int id;
     double salary;
     boolean isEmployee;
	 
	 Bureau(String name,int id)
	 {
		 System.out.println("invoking at static argument in Bureau");
		 this.name=name;
		 this.id=id;
	 }
	 
	 Bureau(double salary,boolean isEmployee)
	 {
		 System.out.println("invoking at Instance argument in Bureau");
		 this.salary=salary;
		 this.isEmployee=isEmployee;
	 }
	 
	 static void printStatic()
	 {
		 System.out.println("invoking at static void in Bureau");
		 System.out.println(name);
		 System.out.println(id);
	 }
	 
	 void printInstance()
	 {
		 System.out.println("invoking at static void in Bureau");
		 System.out.println(salary);
		 System.out.println(isEmployee);
	 }
}