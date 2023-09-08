package com.xworkz.crud.app.reopsitory;

public class JuiceRepositoryImpl implements JuiceRepository {
	private String[] juices = new String[TOTAL_ITEMS];
	private int position=0;

	@Override
	public void store(String juice) {
		System.out.println("invoking store from " + this.getClass().getSimpleName());
		if(position < TOTAL_ITEMS) {
			this.juices[position] = juice;
			System.out.println("Juice is "+ juice + "store ");
			this.position++;
		}
		else {
			System.err.println("Store is full");
		}

	}
	@Override 
	public boolean isExist(String juice) {
		for(int i=0; i<=this.position;i++) {
			String temp=this.juices[i];
			if(temp!=null && temp.equals(juice)) {
				System.out.println("alreday exist");
				return true;
			}
			
		}
		return false;
	}

}
