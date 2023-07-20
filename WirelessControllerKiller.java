class WirelessControllerKiller{
	
	public static void main(String[] values){
		
		System.out.println("invoking main in WirelessControllerKiller");
		WirelessController controller=new WirelessController();
		System.out.println(controller.brand);
		System.out.println(controller.use);
		System.out.println(controller.price);
		System.out.println(controller.maximumRange);
		System.out.println(controller.otherName);
		
		System.out.println("\n");
		
		WirelessController controller1=new WirelessController();
		controller1.brand="Phinolex";
		controller1.use="To connect device to farther distance";
		controller1.price=350;
	    controller1.maximumRange=6;
		controller1.otherName="WLN";
		System.out.println(controller1.brand);
		System.out.println(controller1.use);
		System.out.println(controller1.price);
		System.out.println(controller1.otherName);
		System.out.println(controller1.maximumRange);
		
	}
}