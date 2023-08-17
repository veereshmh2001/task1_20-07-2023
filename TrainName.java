class TrainName{
	
	public static void main(String[] args)
	{
		System.out.println("Running in train name");
		
		 String ref=Train.getTrainName(11013);
		System.out.println("Ref : " + ref);
		
		String ref1=Train.getTrainName(140);
		System.out.println("Ref1 : " + ref1);
		
		String ref2=Train.getTrainName(12134);
		System.out.println("Ref2 : " + ref2);
		
		String ref3=Train.getTrainName(22691);
		System.out.println("Ref3 : " + ref3);
	}
}