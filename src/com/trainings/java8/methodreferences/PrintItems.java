package com.trainings.java8.methodreferences;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class PrintItems {

	public static void main(String[] args) {

		List<String> fruits = List.of("Apple", "Banana", "Cherries", "Dates", "Elderberry", "Fig", "Grapes");
		
//		System.out.println(fruits);
//		
//		for(String fruit: fruits)
//		{
//			System.out.println(fruit);
//		}


		
		//fruits.forEach(str -> System.out.println(str));
		
		fruits.forEach(System.out::println);
		
		
		//convert integer to string
		
		int a = 234523450;
		
		String s = String.valueOf(a);
		
//		System.out.println(s.length());
		
		Function<Integer, String> fun = i -> String.valueOf(i);
		
		
		Function<Integer, String> funMethodref = String::valueOf;
	
		
		System.out.println(funMethodref.apply(204352345).length());
		
		
		
		
	
		
		
		
		

	}
}