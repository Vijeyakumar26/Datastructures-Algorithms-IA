package com.prerequisite.oops;

public class Bird {
	
	private String name;
	private int age;
	
	public void fly() {
		System.out.println(name +" flys!");
	}

	public Bird(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}
