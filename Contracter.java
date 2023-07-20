class Contracter{
static void role(){
		System.out.println("Quality Control");
		Contracter.department();
	}
	static void department(){
		System.out.println("Project Documentation");
		Contracter.problemSolving();
	}
	static void problemSolving(){
		System.out.println("Contractors troubleshoot and resolve construction-related problems");
		Contracter.management();
	}
	static void management(){
		System.out.println("compliance with safety regulations.");
		Contracter.sites(10,50);
	}
	static void sites(int sites, int no){
		System.out.println("sites:" + sites+" " +"no: "+ no);
		Contracter.Hiring("management");
	}
	static void Hiring(String item)
	{
		System.out.println("role:"+ item);
		Contracter.head();
	}
	static void head()
	{
		System.out.println("head of Quality Control");
		Contracter.rowmaterial();
	}
		static void rowmaterial(){
		System.out.println("Better row material");
	}
	


	
}