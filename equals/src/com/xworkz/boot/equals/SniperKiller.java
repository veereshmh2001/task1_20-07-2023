package com.xworkz.boot.equals;

import com.xworkz.app.equals.Sniper;

public class SniperKiller {
	public static void main(String[] args) {
		System.out.println("invoking main Sniper Killer");
		
		Sniper sniper = new Sniper("Marksman", 32, "M24", 75, true, 0.92);
		Sniper sniper2 = new Sniper("Marksman", 32, "M24", 75, false, 0.72);
		System.out.println(sniper);
		
		boolean same = sniper.equals(sniper2);
		System.out.println("Sniper1 and Sniper2 are same " + same);
	}

}
