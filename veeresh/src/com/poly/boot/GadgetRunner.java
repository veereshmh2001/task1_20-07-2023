package com.poly.boot;

import com.poly.app.Gadget;

public class GadgetRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in GadgetRunner");
		Gadget gadget = new Gadget();
		gadget.use();
		gadget.use("Special", 99);
	}
}