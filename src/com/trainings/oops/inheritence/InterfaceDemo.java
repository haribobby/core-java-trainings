package com.trainings.oops.inheritence;

//abstract class Animal {
//	
//	
//	abstract void fly();
//	
//}
//
//
//abstract class FlyMachine {
//	
//	
//	abstract void fly();
//	
//}

interface Flyable {
	public void fly();
}

class Bird implements Flyable { // Bird is a Animal

	@Override
	public void fly() {

		System.out.println("Bird is flying..");
	}
}

class Aeroplane implements Flyable { // Aeroplane is a Machine

	@Override
	public void fly() {

		System.out.println("Aeroplane is flying..");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Flyable obj = new Aeroplane();
		obj.fly();

	}

}
