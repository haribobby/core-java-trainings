package com.trainings.java8.streamapipractice;

import java.util.List;
import java.util.stream.Collectors;

public class ParcticeStreamsAPI {

	public static void main(String[] args) {

		List<String> fruits = List.of("Apple", "Banana", "Cherries", "Dates", "Elderberry", "Fig", "Grapes");
		
		
		
		//1.Print all the fruits
		//fruits.stream().forEach(fruit -> System.out.println(fruit));
		//fruits.stream().forEach(System.out::println);
		
		
		//2.Print each fruit length
		
//		for(String fruit: fruits)
//		{
//			System.out.println(fruit.length());
//		}
//		
		//fruits.stream().forEach(fruit -> System.out.println(fruit.length()));
			
		
		//3.Find fruits whose length/charcount is 5 and print it
		//fruits.stream().filter(fruit -> fruit.length()==5).forEach(fruit -> System.out.println(fruit));
		
		
		//4.find all fruits whose length is 5 and store in list
	//	List<String> length5String= fruits.stream().filter(fruit -> fruit.length()==5).collect(Collectors.toList());
		

		
		//5.convert all fruit names into uppercase and return as list of fruits
//		List<String> upperCaseFruits= fruits.stream().map(fruit -> fruit.toUpperCase()).collect(Collectors.toList());
//		System.out.println(upperCaseFruits);
//		System.out.println(fruits);
//		
		

		
		//6. find fruits whose length is 5, convert to uppercase and get as list
		
		//System.out.println(fruits.stream().filter(fruit -> fruit.length()==5).map(fruit -> fruit.toUpperCase()).collect(Collectors.toList()));
		
		

		
		
	}
}
