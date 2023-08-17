class Drone{
	
	static double getDistanceByFlight(String operator,String event){
		
		System.out.println("Invoking getDistanceByFlight in Drone");
		
		if(operator!=null &&event!=null){// true
			
			System.out.println("Operator  and eventis valid");
			
			if("Garud"==operator && "Air Show Contest"==event){//false
				return 2.0;
			}
			
		}
		
		else{
			System.out.println("Operator and event is in-valid");
			return -2.0;
		}
		return -1;
		
	}
	
	
	static double getPricePerEvent(String eventName){
		
		System.out.println("Invoking getPricePerEvent in Drone");
		
		if(eventName!=null){
			
			System.out.println("Event name is valid");
			
			if("Air Show Contest"==eventName){
				return 600.0;
			}
			
		}
		
		else{
			System.out.println("Event name is in-valid");
			return 100.0;
		}
		
		
	}
	
	static int getDiscountByEvent(String eventName,String refPerson){
		
		System.out.println("Invoking getDiscountByEvent in Drone");
		
		if(eventName!=null &&refPerson!=null){
			
			System.out.println("Event Name  and refered person is valid");
			
			if("Air Show Contest"==eventName && "Veeresh"==refPerson){
				return 25;
			}
			
		}
		else{
			System.out.println("Operator and event is in-valid");
			return -5;
		}
		
		
	}
	
	
}