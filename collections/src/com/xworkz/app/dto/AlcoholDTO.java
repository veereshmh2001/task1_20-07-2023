package com.xworkz.app.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AlcoholDTO {
	private String name;
    private byte alcoholContent; // Primitive byte
    private short volume; // Primitive short
    private int quantity; // Primitive int
    private long id; // Primitive long
    private float price; // Primitive float
    private double rating; // Primitive double
    private char category; // Primitive char
    private boolean isAvailable; // Primitive boolean
    private LocalDate dateProduced;
    private LocalDateTime updatedDate;
	public AlcoholDTO() {
		super();
	}
	public AlcoholDTO(String name, byte alcoholContent, short volume, int quantity, long id, float price, double rating,
			char category, boolean isAvailable, LocalDate dateProduced, LocalDateTime updatedDate) {
		super();
		this.name = name;
		this.alcoholContent = alcoholContent;
		this.volume = volume;
		this.quantity = quantity;
		this.id = id;
		this.price = price;
		this.rating = rating;
		this.category = category;
		this.isAvailable = isAvailable;
		this.dateProduced = dateProduced;
		this.updatedDate = updatedDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getAlcoholContent() {
		return alcoholContent;
	}
	public void setAlcoholContent(byte alcoholContent) {
		this.alcoholContent = alcoholContent;
	}
	public short getVolume() {
		return volume;
	}
	public void setVolume(short volume) {
		this.volume = volume;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public char getCategory() {
		return category;
	}
	public void setCategory(char category) {
		this.category = category;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public LocalDate getDateProduced() {
		return dateProduced;
	}
	public void setDateProduced(LocalDate dateProduced) {
		this.dateProduced = dateProduced;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "AlcoholDTO [name=" + name + ", alcoholContent=" + alcoholContent + ", volume=" + volume + ", quantity="
				+ quantity + ", id=" + id + ", price=" + price + ", rating=" + rating + ", category=" + category
				+ ", isAvailable=" + isAvailable + ", dateProduced=" + dateProduced + ", updatedDate=" + updatedDate
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + alcoholContent;
		result = prime * result + category;
		result = prime * result + ((dateProduced == null) ? 0 : dateProduced.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (isAvailable ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + quantity;
		long temp;
		temp = Double.doubleToLongBits(rating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((updatedDate == null) ? 0 : updatedDate.hashCode());
		result = prime * result + volume;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlcoholDTO other = (AlcoholDTO) obj;
		if (alcoholContent != other.alcoholContent)
			return false;
		if (category != other.category)
			return false;
		if (dateProduced == null) {
			if (other.dateProduced != null)
				return false;
		} else if (!dateProduced.equals(other.dateProduced))
			return false;
		if (id != other.id)
			return false;
		if (isAvailable != other.isAvailable)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (quantity != other.quantity)
			return false;
		if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
			return false;
		if (updatedDate == null) {
			if (other.updatedDate != null)
				return false;
		} else if (!updatedDate.equals(other.updatedDate))
			return false;
		if (volume != other.volume)
			return false;
		return true;
	}

    
	

}
