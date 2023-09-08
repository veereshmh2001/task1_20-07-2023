package com.xworkz.newspaper.app.dto;

import java.io.Serializable;

public class PrinterDTO implements Serializable {

	String brand;
	double price;
	int warranty;
	boolean isColorPrint;

	public void name() {

	}

	public PrinterDTO(String brand, double price, int warranty, boolean isColorPrint) {
		super();
		this.brand = brand;
		this.price = price;
		this.warranty = warranty;
		this.isColorPrint = isColorPrint;
	}

	@Override
	public String toString() {
		return "PrinterDTO [brand=" + brand + ", price=" + price + ", warranty=" + warranty + ", isColorPrint="
				+ isColorPrint + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public boolean isColorPrint() {
		return isColorPrint;
	}

	public void setColorPrint(boolean isColorPrint) {
		this.isColorPrint = isColorPrint;
	}

}
