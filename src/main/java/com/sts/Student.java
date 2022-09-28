package com.sts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private String name;
	@Autowired
	@Qualifier("clg")
	private College clg;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, College clg) {
		super();
		this.name = name;
		this.clg = clg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public College getClg() {
		return clg;
	}
	public void setClg(College clg) {
		this.clg = clg;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", clg=" + clg + "]";
	}
	
	
	
}
