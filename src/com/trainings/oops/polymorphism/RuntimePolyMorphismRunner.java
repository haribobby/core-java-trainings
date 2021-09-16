package com.trainings.oops.polymorphism;

abstract class Shape {

	public abstract void area();
}

class Triangle extends Shape {
	
	@Override
	public void area() {
		System.out.println("Triangle is ½ * base * height ");
	}
}

class Circle extends Shape {
	
	@Override
	public void area() {
		System.out.println("Circle is 3.14 * radius * radius ");
	}
}

public class RuntimePolyMorphismRunner {

	public static void main(String[] args) {

		Shape shape = new Triangle(); // Create a Triangle object
		shape.area();

	}

}
