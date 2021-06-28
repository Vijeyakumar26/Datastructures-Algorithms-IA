package com.prerequisite.oops;

public class Zoo {

	public static void main(String[] args) {
		
		Animal tiger = new Animal("Tiger", 10, "M");
		Animal peacock = new Animal("Peacock", 11, "F");
		Animal hen = new Animal("Hen", 10, "M");
		
		tiger.eat();
		peacock.sleep();
		hen.eat();
		
		
		Bird eagle = new Bird("Eagle", 5);
		eagle.fly();
	}

}
