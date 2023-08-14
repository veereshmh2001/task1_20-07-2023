package com.xworkz.encpasulation.boot;

import com.xworkz.encapsulation.app.WhatsApp;

public class WhatsAppRunner {
	
	public static void main(String[] args) {
		
		System.out.println("Invoking main in WhatsAppRunner");
		System.out.println("Invoking WhatsApp in main");
		WhatsApp whatsApp = new WhatsApp();
		whatsApp.setBlockContacts(20);
		whatsApp.setCall("voice call");
		whatsApp.setFingerPrint(true);
		whatsApp.setFontSize(10);
		whatsApp.setFontStyle("Itallic");
		whatsApp.setLanguage("English");
		whatsApp.setLinkedDevices(2);
		whatsApp.setMessageType("Text");
		whatsApp.setNoOfContacts(150);
		whatsApp.setNoOfGroups(15);
		whatsApp.setNumber(9611965471l);
		whatsApp.setStorage(25);
		whatsApp.setTheme("Nature");
		whatsApp.setWallPaper("Flower");
		System.out.println(whatsApp.getCall());
		System.out.println(whatsApp.getFontSize());
		System.out.println(whatsApp.getFontStyle());
		System.out.println(whatsApp.getLanguage());
		System.out.println(whatsApp.getMessageType());
		System.out.println(whatsApp.getNoOfGroups());
		System.out.println(whatsApp.getNumber());
		System.out.println(whatsApp.getTheme());
		System.out.println(whatsApp.getWallPaper());
		System.out.println(whatsApp.isBlockContacts());
		System.out.println(whatsApp.isFingerPrint());
		System.out.println(whatsApp.isLinkedDevices());
		System.out.println(whatsApp.isNoOfContacts());
		System.out.println(whatsApp.isStorage());


	}
}
		

