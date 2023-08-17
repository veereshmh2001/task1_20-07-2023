class PenDriveKiller{
	
	public static void main(String[] args){
		
		System.out.println("Running in PenDriveKiller");
		
		int ref=PenDrive.getCapacityByBrand("Dell");
		System.out.println("Ref is: " + ref);
		
		ref=PenDrive.getCapacityByBrand("Sony");
		
				System.out.println("Ref is: " + ref);

	}
}