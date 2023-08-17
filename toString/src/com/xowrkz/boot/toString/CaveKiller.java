package com.xowrkz.boot.toString;

import com.xworkz.app.toString.Cave;

public class CaveKiller {
	
	public static void main(String[] args) {
		System.out.println("invoking main in cave killer");
		
		Cave cave = new Cave("Crystal Cave", 15.5, 50, true, false, 120, 100, "Mountain Range", true, false);
		System.out.println(cave);
	}

}
