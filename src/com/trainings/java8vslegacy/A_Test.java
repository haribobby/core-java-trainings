package com.trainings.java8vslegacy;

public class A_Test {

	public static void main(String[] args) {

		String someString = "elephante";
		char someChar = 'e';
		int count = 0;

		for (int i = 0; i < someString.length(); i++) {
			if (someString.charAt(i) == someChar) {
				count++;
			}
		}

		System.out.println(count);
		
		System.out.println(someString.chars().filter(ch -> ch == 'e').count());
		
	}
}
