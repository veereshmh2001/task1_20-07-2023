class BureauOffice{
	
	public static void main(String[] args){
		
		System.out.println("invoking main method in BureauOffice");
		
		Bureau bureau=new Bureau("John Doe", 12345);
		Bureau.printStatic();
		
		
		Bureau bureau1=new Bureau(45000.50, true);
		bureau1.printInstance();
	}
}