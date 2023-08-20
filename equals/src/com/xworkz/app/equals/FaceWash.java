package com.xworkz.app.equals;

public class FaceWash {
	
	
	    private String brand;
	    private String type;
	    private double price;
	    private boolean isOrganic;
	    private int volume;

	    public FaceWash(String brand, String type, double price, boolean isOrganic, int volume) {
	        this.brand = brand;
	        this.type = type;
	        this.price = price;
	        this.isOrganic = isOrganic;
	        this.volume = volume;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;

	        FaceWash faceWash = (FaceWash) obj;

	        if (Double.compare(faceWash.price, price) != 0) return false;
	        if (isOrganic != faceWash.isOrganic) return false;
	        if (volume != faceWash.volume) return false;
	        if (!brand.equals(faceWash.brand)) return false;
	        return type.equals(faceWash.type);
	    }

	    public static void main(String[] args) {
	        FaceWash faceWash1 = new FaceWash("BrandA", "Foam", 8.99, true, 150);
	        FaceWash faceWash2 = new FaceWash("BrandB", "Gel", 10.49, false, 200);
	        FaceWash faceWash3 = new FaceWash("BrandA", "Foam", 8.99, true, 150);

	        System.out.println("faceWash1.equals(faceWash2): " + faceWash1.equals(faceWash2)); 
	        System.out.println("faceWash1.equals(faceWash3): " + faceWash1.equals(faceWash3)); 
	    }
	


}
