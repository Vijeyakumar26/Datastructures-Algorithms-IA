package com.prerequisite.oops;

public class Animal {
	
	private String name;
	private int age;
	private String gender;
	
	public void eat()
	{
		System.out.println(name + "is eating!");
	}
	public void sleep()
	{
		System.out.println(name + "is sleeping!");
	}
	
	public Animal() {}
	
	public Animal(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}
