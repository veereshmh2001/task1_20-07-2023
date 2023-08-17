package com.xworkz.app.toString;

public class Cave {
	
	private String name;
    private double temperature;
    private int capacity;
    private boolean hasWater;
    private boolean hasTreasure;
    private int stalactiteCount;
    private int stalagmiteCount;
    private String location;
    private boolean isExplored;
    private boolean isAccessible;
    
    public Cave() {
    	
    }

	public Cave(String name, double temperature, int capacity, boolean hasWater, boolean hasTreasure,
			int stalactiteCount, int stalagmiteCount, String location, boolean isExplored, boolean isAccessible) {
		super();
		this.name = name;
		this.temperature = temperature;
		this.capacity = capacity;
		this.hasWater = hasWater;
		this.hasTreasure = hasTreasure;
		this.stalactiteCount = stalactiteCount;
		this.stalagmiteCount = stalagmiteCount;
		this.location = location;
		this.isExplored = isExplored;
		this.isAccessible = isAccessible;
	}
    
    @Override
    public String toString() {
    	
    	return "Name :" + this.name + "Temperature :" + this.temperature + "Capacity :" + this.capacity + "Has Water:" + this.hasWater + "Has Treasure:" + this.hasTreasure + "Stalactite Count:" + this.stalactiteCount + "Stalagmite Count:" + this.stalagmiteCount + "Location:" + this.location + "Is Explored:" + this.isExplored + "Is Accessible:" + this.isAccessible; 
    }

}
