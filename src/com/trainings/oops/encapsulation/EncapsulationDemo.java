package com.trainings.oops.encapsulation;



class Animal {

	private String name; // data (state)
	private int age;
	private String color;

	Animal() {
		System.out.println("Animal Constructor...");
	}

	Animal(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

//	Animal()
	// setters and getters methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void eat() // behaviours
	{
		System.out.println("Eating...");
	}

	public void sleep() {
		System.out.println("Sleeping...");
	}

	public void bark() {
		System.out.println("Speaking...");
	}

}

public class EncapsulationDemo { // Runner or client

	public static void main(String[] args) {

		Animal animal = new Animal("cat", 3, "blue");

		System.out.println("animal1 age is... " + animal.getAge());
		System.out.println(" animal1color is... " + animal.getColor());
		System.out.println(" animal1 name is... " + animal.getName());

//		
//		System.out.println();
//		
//		
//		animal.setAge(3);
//		animal.setColor("yellow");
//		animal.setName("Cat");
//		
//		
//		System.out.println("animal1 age is... " + animal.getAge());
//		System.out.println(" animal1color is... " + animal.getColor());
//		System.out.println(" animal1 name is... " + animal.getName());

//		Animal animal2 = new Animal();
//
////		animal.age = -10;
////		animal.color = "yellow";
////		animal.name ="Cat";
//
//		animal2.setAge(2);
//		animal2.setColor("brown");
//		animal2.setName("Dog");
//	
//
//		System.out.println(" animal2 age is... " + animal2.getAge());
//		System.out.println(" animal2 color is... " + animal2.getColor());
//		System.out.println(" animal2 name is... " + animal2.getName());
//		System.out.println(" animal1 hashcode... " + animal2.hashCode());

	}

}
