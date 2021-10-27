package com.trainings.puzzles;

public class MethodOverrdingTestMain {

	public static void main(String[] args) {
		A1 a1 = new B1(); // DMD
//		a1.method2();

	}
}

class A1 {

	public void method1() {
		System.out.println("Method1 in class A");
	}
}

class B1 extends A1 {

	@Override
	public void method1() {
		System.out.println("Method1 in class B");
	}

	public void method2() {
		System.out.println("Method2 in class B");
	}
}