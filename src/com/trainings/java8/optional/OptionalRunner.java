package com.trainings.java8.optional;

import java.util.Optional;

public class OptionalRunner {

	public static void main(String[] args) {

		// Avoiding NPE

		String s = getStringData();
//		if (s != null) {
//			System.out.println(s);
//		}else {
//			System.out.println("String is null");
//		}
		
		
		
		Optional<String> strOptional = Optional.ofNullable(getStringData());
		System.out.println(strOptional.orElse("String is null"));
	
		
	}
	
	
	
	static String getStringData()
	{
		//logic
		return "java";
	}
}