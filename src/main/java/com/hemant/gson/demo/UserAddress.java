package com.hemant.gson.demo;

public class UserAddress {
	private String street;
	private String houseNumber;
	private String city;
	private String country;
	
	public UserAddress() {
	}

	public UserAddress(String street, String houseNumber, String city, String country) {
		super();
		this.street = street;
		this.houseNumber = houseNumber;
		this.city = city;
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Address: [" + this.street + ", " + this.houseNumber + ", " + this.city + ", " + this.country + "]"; 
	}
	
	
}
