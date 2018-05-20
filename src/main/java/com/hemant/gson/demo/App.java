package com.hemant.gson.demo;

import com.google.gson.Gson;

public class App {
	
	private static String json;
	
	public static void main(String[] args) {
		
		serializeJson();
		
		deserializeJson();
	}

	public static void serializeJson() {
		UserAddress userAddress = new UserAddress("Main Street", "42A", "Fairfax", "United States");
		User user = new User("Hemant", "hemant@gmail.com", 25, true, userAddress);
		
		json = new Gson().toJson(user);
		System.out.println(json);
	}
	
	public static void deserializeJson() {
		Gson gson = new Gson();

		User user = gson.fromJson(json, User.class);
		System.out.println(user);
	}
}
