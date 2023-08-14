package com.xworkz.encapsulation.app;

public class WhatsApp {
	
	private long number;
	private String call;
	private String fontStyle;
	private int fontSize;
	private String theme;
	private int storage;
	private String language;
	private int noOfContacts;
	private int blockContacts;
	private int linkedDevices;
	private boolean fingerPrint;
	private int noOfGroups;
	private String wallPaper;
	private String messageType;

	public long getNumber() {
		return this.number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getCall() {
		return this.call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	public String getFontStyle() {
		return this.fontStyle;
	}

	public void setFontStyle(String fontStyle) {
		this.fontStyle = fontStyle;
	}

	public boolean isFingerPrint() {
		return this.fingerPrint;
	}

	public void setFingerPrint(boolean fingerPrint) {
		this.fingerPrint = fingerPrint;
	}

	public int getFontSize() {
		return this.fontSize;
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public int isStorage() {
		return this.storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int isNoOfContacts() {
		return this.noOfContacts;
	}

	public void setNoOfContacts(int noOfContacts) {
		this.noOfContacts = noOfContacts;
	}

	public int isBlockContacts() {
		return this.blockContacts;
	}

	public void setBlockContacts(int blockContacts) {
		this.blockContacts = blockContacts;
	}

	public int isLinkedDevices() {
		return this.linkedDevices;
	}

	public void setLinkedDevices(int linkedDevices) {
		this.linkedDevices = linkedDevices;
	}

	public String getWallPaper() {
		return this.wallPaper;
	}

	public void setWallPaper(String wallPaper) {
		this.wallPaper = wallPaper;
	}

	public int getNoOfGroups() {
		return this.noOfGroups;
	}

	public void setNoOfGroups(int noOfGroups) {
		this.noOfGroups = noOfGroups;
	}

	public String getMessageType() {
		return this.messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}


}
