package com.trainings.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationRunner {

	public static void main(String[] args) {
		
		
		
		
		int x =2;
		if(x==2)
		{
			
		}else
		{
			
		}

		List fruits = new ArrayList(); // Dynamic Array
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Carrot");
		fruits.add(1);
		fruits.add(true);

		System.out.println(fruits.get(4));

		// Java 8
		// fruits.forEach(System.out::println);

//		System.out.println(fruits);
//		
//		System.out.println();
//		
//		//Index for loop
//		for(int i=0;i<fruits.size();i++)
//		{
//			System.out.println(fruits.get(i));
//		}

		// enahnced for loop (for-each)
//		for(Object s: fruits) {
//			
//			System.out.println(s);
//		//	fruits.remove(s);
//			
//		}
//		
		// Iterator
//	
//		Iterator it = fruits.iterator(); // fail fast
////		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//			it.remove();
//		}
//		
//		System.out.println(fruits);
//		

		// System.out.println(fruits);
	}
}
