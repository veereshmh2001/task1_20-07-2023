package com.veeresh.boot;

import com.veeresh.app.Gate;
import com.veeresh.app.GateWay;

public class GateOpen {
	public static void main(String[] args) {
		System.out.println("invoking main in gateopen");
		
		Gate gate = new GateWay();
		gate.open();
	}

}
