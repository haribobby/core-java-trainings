package com.trainings.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapRunner {

	public static void main(String[] args) {

		Map hm = new HashMap();
		hm.put(100, "John");
		hm.put(101, "John1");
		hm.put(102, "John2");
		hm.put(103, "John3");
		hm.put("Apple", 100);
		hm.put(103, "John3");
		hm.put("Bana", 200);
		hm.put(100, "Jessy");

		//System.out.println("Hash map... " + hm);
		
		
		
		hm.forEach((key,value) -> System.out.println(key+" "+value));

		LinkedHashMap lhm = new LinkedHashMap(); // Order is preserved
		lhm.put("ZZZZ", "90");
		lhm.put(100, "John");
		lhm.put(101, "John1");
		lhm.put(102, "John2");
		lhm.put(103, "John3");
		lhm.put("Apple", "5");
		lhm.put("Banana", "5");

		//System.out.println("linked Hash map... " + lhm);

		TreeMap tm = new TreeMap(); // Sorting order by keys
		tm.put(100, "John");
		tm.put(101, "John1");
		tm.put(102, "John2");
		tm.put(103, "John3");
		tm.put(1, "John1111");

		//System.out.println("tree map... " + tm);
		
		

	}
}
