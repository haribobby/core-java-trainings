package com.trainings.collections;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethod {

	public static void main(String[] args) {

		System.out.println(getList(List.of("Apple", "Banana", "Orange")));

		System.out.println(getListUpperBound(List.of("Apple1", "Banana1", "Orange1")));
	}

	static List<? extends String> getListUpperBound(List<? extends String> list) {

		return list;
	}

	static <T> List<T> getList(List<T> argList) {

		List<T> list = new ArrayList<T>();
		for (T element : argList) {
			list.add(element);
		}
		return list;

	}

	// line 20: <T> means We are saying to compiler this is an arbitrary type which can be any object.
	// line 20: List<T> => getList method will return a List containing elements of that type T

	
}
