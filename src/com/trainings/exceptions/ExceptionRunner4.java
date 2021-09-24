package com.trainings.exceptions;

public class ExceptionRunner4 {

	public static void main(String[] args) {
		
		System.out.println("Main method starts");
		
		method1();
		
		System.out.println("Main method Ends");
	}

	private static void method1() {
		
		System.out.println("method1() starts");
		
		method2();
		
		System.out.println("method1() Ended");
	}

	private static void method2() {
		
		System.out.println("method2() starts");
		
		
		try {
		String str = null;
		System.out.println("String lenght is .... "+str.length());
		}catch (NullPointerException e) {
			System.out.println("you can't call method() on NULL");
		}
		
		System.out.println("method2() end");
	}

}

