package com.trainings.oops.encapsulation;



class Cat {

	private String name; // data (state)
	private int age;
	private String color;

	Cat() {
		System.out.println("Cat Constructor...");
	}

	Cat(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

//	cat()
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

		Cat cat = new Cat("abc", 3, "whoite");

		System.out.println("cat1 age is... " + cat.getAge());
		System.out.println(" cat1color is... " + cat.getColor());
		System.out.println(" cat1 name is... " + cat.getName());

//		
//		System.out.println();
//		
//		
//		cat.setAge(3);
//		cat.setColor("yellow");
//		cat.setName("Cat");
//		
//		
//		System.out.println("cat1 age is... " + cat.getAge());
//		System.out.println(" cat1color is... " + cat.getColor());
//		System.out.println(" cat1 name is... " + cat.getName());

//		Cat cat2 = new Cat();
//
////		cat.age = -10;
////		cat.color = "yellow";
////		cat.name ="Cat";
//
//		cat2.setAge(2);
//		cat2.setColor("brown");
//		cat2.setName("Dog");
//	
//
//		System.out.println(" cat2 age is... " + cat2.getAge());
//		System.out.println(" cat2 color is... " + cat2.getColor());
//		System.out.println(" cat2 name is... " + cat2.getName());
//		System.out.println(" cat1 hashcode... " + cat2.hashCode());

	}

}
