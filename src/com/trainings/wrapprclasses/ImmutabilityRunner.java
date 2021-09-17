package com.trainings.wrapprclasses;

public class ImmutabilityRunner {

	
	public static void main(String[] args) {
		
		
		String s = "Hello"; // Literals
		
		String s1 = new String("Hello"); // new key word
		
		s.concat("World");
		
		System.out.println("String data is.... "+s);
		
		
		StringBuilder sb = new StringBuilder("HelloStringBuilder");
		sb.append("World");
		
		
		System.out.println("StringBuilder data is.... "+sb);
		
		//ImmutabilityRunner@4EE
		
	}
}
