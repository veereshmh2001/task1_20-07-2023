 class ResumeFormat{
	
	static void format(){
		System.out.println("Format of resume");
	}
	
	static void format(String type){
		System.out.println("Format of resume is: " + type);
	}
	
	static void format(String type, int pages){
		System.out.println("Format of resume is: " + type);
		System.out.println("Pages of the resume is: " + pages);
	}
	
	static void delete(){
		System.out.println("Deleting the resume");
	}
	
	public static void main(String[] args){
		format();
		System.out.println("\n");
		
		format("pdf");
		System.out.println("\n");
		
		format("doc", 2);
		System.out.println("\n");
		
		delete();
	}
}