package com.trainings.oops.polymorphism;

class Calculator {

	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b;
	}

	int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}
}

public class CompiletimePolyMorphismRunner { // Overloading

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int res = cal.add(1,2);
		System.out.println(res);
		

	}

}
