package com.trainings.oops.abstarctionandinheritance;

abstract class Animal {

	private String color;
	private int age;

	abstract void bark();

	public void run() {

		System.out.println("running...");
	}

}

class Cat extends Animal { // cat is a animal

	public void bark() {

		System.out.println("Meow Meow");
	}

}

class Dog extends Animal {

	public void bark() {

		System.out.println("Bow Bow");
	}

}

//abstract classes / intrefaces
public class AbstarctionDemo {

	public static void main(String[] args) {

		// Animal animal = new Animal(); // Animal is born
//
//		Cat c = new Cat();
//		c.bark();
//		c.run();
//
//		Dog d = new Dog();
//		d.bark();
//		d.run();

		// Animal animal = new Animal();
		Animal animal = new Dog(); // Runtime polymorphism
		animal.bark();
		animal.run();

	}

}
