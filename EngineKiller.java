class EngineKiller{

		public static void main(String[] args)
		{
			System.out.println("running in EngineKiller");
			
			int ref=Engine.getCCModel("Swift");
			System.out.println("Ref :"+ ref);
			
			int ref1=Engine.getCCModel("Audi");
			System.out.println("Ref1 :"+ ref1);
			
			int ref2=Engine.getCCModel("Benz");
			System.out.println("Ref2 :"+ ref2);
			
			int ref3=Engine.getCCModel("Bently");
			System.out.println("Ref3 :"+ ref3);
			
			int ref4=Engine.getCCModel("BMW");
			System.out.println("Ref4 :"+ ref4);
			
			int ref5=Engine.getCCModel("Rapid");
			System.out.println("Ref4 :"+ ref5);
			
			Engine.getCCModel("car");
		}
}