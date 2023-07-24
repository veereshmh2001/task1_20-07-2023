class Soil{
	
	 static String type;
     static double pHLevel;
     boolean isFertile;
     int moisturePercentage;
	 
	 Soil(String type,double pHLevel)
	 {
		 System.out.println("invoking at static argument in Soil");
		 this.type=type;
		 this.pHLevel=pHLevel;
	 }
	 
	 Soil(boolean isFertile,int moisturePercentage)
	 {
		 System.out.println("invoking at Instance argument in Soil");
		 this.isFertile=isFertile;
		 this.moisturePercentage=moisturePercentage;
	 }
	 
	 static void printStatic()
	 {
		 System.out.println("invoking at static void in Soil");
		 System.out.println(type);
		 System.out.println(pHLevel);
	 }
	 
	 void printInstance()
	 {
		 System.out.println("invoking at Instance void in Soil");
		 System.out.println(isFertile);
		 System.out.println(moisturePercentage);
	 }
}