package com.trainings.exceptions;

public class ExceptionRunner1 {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		try {
			
			int c = a / b; // Risky code
			
			System.out.println("Hello....");
			System.out.println(c);
			
		} catch (ArithmeticException e) {

			System.out.println("You can't divide by zero");
		}

//		try   => Risky
//		catch  => Handling code 
//		finally => Always execute

//		throw
//		throws
	}

}
