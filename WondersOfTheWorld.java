class WondersOfTheWorld{
	 
	 public static void main(String[] args) {
		 
		 System.out.println(" Wonders of the world ");
		 
		 String greatwallofchina=" Great wall of china ";
		 String tajmahal=" Taj Mahal ";
		 String colossem=" Colossem ";
		 String eiffeltower=" Eiffel Tower ";
		 String pyramidofgizza=" Pyramid of Gizza ";
		 String petra=" Petra ";
		 String machupicchu=" Machu Picchu ";
		 
		 String[] wondersoftheworld={eiffeltower,petra,pyramidofgizza,machupicchu,greatwallofchina,tajmahal,colossem};
		 
		 int total=wondersoftheworld.length;
		 
		 System.out.println(" Total : " + total);
		 
		 for(int start=0; start<wondersoftheworld.length; start++)
			 
			 {
				 System.out.println(" WondersOfTheWorld " + start + " are " + wondersoftheworld[start]);
			 }
			 
			 wondersoftheworld[6]=" Jog Falls ";
			 System.out.println(" The updated value ");
			 
			 System.out.println("\n");
			 
			 for(int start=wondersoftheworld.length-1; start>=0; start--)
				 
				 {
					 System.out.println(" WondersOfTheWorld " + start + " are " + wondersoftheworld[start]);
				 }
	 }
}	 
			 
			 
			 