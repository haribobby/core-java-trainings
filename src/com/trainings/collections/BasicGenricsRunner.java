package com.trainings.collections;

import java.util.ArrayList;
import java.util.List;

public class BasicGenricsRunner {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<String>();
		
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Carrot");
		fruits.add("AB");
		fruits.add("sadfasdfads");
	
		
		
		String first = fruits.get(0);
		
		System.out.println(first);
		
		
		
	}
	

}
