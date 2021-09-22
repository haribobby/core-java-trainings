package com.trainings.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetRunner {

	public static void main(String[] args) {

		Set hs = new HashSet(); // Insertion order is not preserved. Duplicates not allowed

		hs.add("banana");
		hs.add(1);
		hs.add("carrot");
		hs.add("apple");
		hs.add("carrot");
		hs.add("carrot");
		hs.add(1);
		hs.add(1);

		System.out.println(hs);

		Set lhs = new LinkedHashSet(); // Insertion order preserved. Duplicates not allowed

		lhs.add("zzzz");
		lhs.add("yyy");
		lhs.add("banana");
		lhs.add("carrot");
		lhs.add("apple");
		lhs.add("carrot");
		lhs.add("carrot");
		lhs.add(1000);
		lhs.add(2);
		lhs.add(1);
		lhs.add(1);

		System.out.println(hs);
		
		
		
		Set ts = new TreeSet(); // Natural Sorted Order  - Asc
		

//		
//		Animal a1 = new Animal("puppy", 10);
//		Animal a2 = new Animal("apuppy", 20);
		
		ts.add("zzzz");
		ts.add("yyy");
		ts.add("banana");
		ts.add("carrot");
		ts.add("apple");
		ts.add("carrot");
		ts.add("carrot");
	
		
//		ts.add(1000);
//		ts.add(2);	
//		ts.add(1);	
//		ts.add(78888);
		
////		ts.add(a1);
//		ts.add(a2);

		System.out.println(ts);
		
		
		
		

	}

}


class Animal {
	
	
	private String name;
	
	private int age;

	public Animal(String name, int age) {
	
		this.name = name;
		this.age = age;
	}
	
	
	
}
