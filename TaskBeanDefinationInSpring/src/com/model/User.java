package com.model;

public class User {
	private int id;
	private String name;
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void show()
	{
		System.out.println("UID: "+id);
		System.out.println("UName: "+name);
		System.out.println("UCity: "+city);
	}
}
