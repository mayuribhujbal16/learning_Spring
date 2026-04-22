package com.model;

public class Address {
	private String city, state, country;
	private int pincode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStste() {
		return state;
	}

	public void setState(String stste) {
		this.state = stste;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city= " + city + ", state= " + state + ", country= " + country + ", pincode= " + pincode + "]";
	}

	

}
