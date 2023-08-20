package com.xworkz.boot.equals;

import com.xworkz.app.equals.FaceWash;

public class FaceWashRunner {

	public static void main(String[] args) {
        FaceWash faceWash1 = new FaceWash("BrandA", "Foam", 8.99, true, 150);
        FaceWash faceWash2 = new FaceWash("BrandB", "Gel", 10.49, false, 200);
        FaceWash faceWash3 = new FaceWash("BrandA", "Foam", 8.99, true, 150);

        System.out.println("faceWash1.equals(faceWash2): " + faceWash1.equals(faceWash2)); 
        System.out.println("faceWash1.equals(faceWash3): " + faceWash1.equals(faceWash3)); 
    }
		

}
