package com.hemant.gson.demo;

public class User {
	private String name;
	private String email;
	private int age;
	private boolean isDeveloper;
	private UserAddress userAddress;

	public User() {

	}

	public User(String name, String email, int age, boolean isDeveloper, UserAddress userAddress) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.isDeveloper = isDeveloper;
		this.setUserAddress(userAddress);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isDeveloper() {
		return isDeveloper;
	}

	public void setDeveloper(boolean isDeveloper) {
		this.isDeveloper = isDeveloper;
	}
	
	@Override
	public String toString() {
		return "User : [" + this.name +", "+ this.email +", "+ this.age + ", " + this.isDeveloper + "]";
	}

	public UserAddress getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(UserAddress userAddress) {
		this.userAddress = userAddress;
	}
}
