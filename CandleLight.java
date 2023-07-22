class CandleLight{
	
	public static void main(String[] args){
		
		System.out.println("invoking main method in CandleLight");
		
		Candle candle=new Candle("Red", 7.5);
		Candle.printStatic();
		
		
		Candle candle1=new Candle(20, true);
		candle1.printInstance();
	}
}