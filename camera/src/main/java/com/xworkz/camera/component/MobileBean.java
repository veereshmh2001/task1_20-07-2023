package com.xworkz.camera.component;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MobileBean {
	public MobileBean() {
		System.out.println("Running MobileBean");
	}
	
	public MobileBean bean() {
		MobileBean bean = new MobileBean();
		return bean;
	}

}
