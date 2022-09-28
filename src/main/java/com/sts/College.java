package com.sts;

import org.springframework.context.annotation.Bean;

public class College {
	private String name;
	private String city;
	
	
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "College [name=" + name + ", city=" + city + "]";
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


	public College(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public College getCollege()
	{
		return new College("Global college","Jabalpur");
	}
	
}
