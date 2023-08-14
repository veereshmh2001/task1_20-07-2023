package com.xworkz.encpasulation.boot;

import com.xworkz.encapsulation.app.Instagram;


public class InstagramRunner {
	
	public static void main(String[] args) {
		
	
	
	System.out.println("Invoking main in InstagramRunner");
	System.out.println("Invoking Instagram in main");
	Instagram instagram = new Instagram();
	instagram.setUsername("veeru");
	instagram.setPassword(8660);
	instagram.setId("veeruhanchinal11");
	instagram.setWallpaper("tricolor");
	instagram.setnoOfFollowers(500);
	instagram.setnoOfFollowing(500);
	instagram.setTheme("dark");
	instagram.setLanguage("english");
	instagram.setPosts(150);
	instagram.setBio("travel Photography");
	instagram.setVerified(true);
	instagram.setPrivateAccount(true);
	instagram.setPhoneNumber(866051295);
	instagram.setStoryCount(250);
	System.out.println(instagram.getUsername());
	System.out.println(instagram.getPassword());
	System.out.println(instagram.getId());
	System.out.println(instagram.getWallpaper());
	System.out.println(instagram.getnoOfFollowers());
	System.out.println(instagram.getnoOfFollowing());
	System.out.println(instagram.getTheme());
	System.out.println(instagram.getLanguage());
	System.out.println(instagram.getPosts());
	System.out.println(instagram.getBio());
	System.out.println(instagram.getVerified());
	System.out.println(instagram.getPrivateAccount());
	System.out.println(instagram.getPhoneNumber());
	System.out.println(instagram.getStoryCount());

}
}

