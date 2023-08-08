package com.veeresh.app;

public class GateWay extends Gate {
	public GateWay() {

	}

	@Override
	public void open() {
		System.out.println("invoking in gateway");
	}
}
