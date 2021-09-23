package com.trainings.collections;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("apple");
		list.add("banana");

		String s = list.get(0);
		String s1 = list.get(1);

		System.out.println(s + " " + s1);

		List<Integer> intList = new ArrayList<Integer>();

		intList.add(100);
		intList.add(200);

		System.out.println(intList);
	}

}
