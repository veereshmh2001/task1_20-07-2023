package com.xworkz.newspaper.app.dto;

import java.io.Serializable;

public class WeatherDTO implements Serializable{
	
	private String location;
    private double temperature;
    private double humidity;
    private String condition;
    
    public void name() {
		
	}

	public WeatherDTO(String location, double temperature, double humidity, String condition) {
		super();
		this.location = location;
		this.temperature = temperature;
		this.humidity = humidity;
		this.condition = condition;
	}

	@Override
	public String toString() {
		return "WeatherDTO [location=" + location + ", temperature=" + temperature + ", humidity=" + humidity
				+ ", condition=" + condition + "]";
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
    
    

}
