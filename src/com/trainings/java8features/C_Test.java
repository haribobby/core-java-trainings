package com.trainings.java8features;

import java.util.List;

public class C_Test {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		for (int i = 0; i < numbers.size(); i++) {

			System.out.println(numbers.get(i));

		}

		for (Integer integer : numbers) {
			System.out.println(integer);
		}

	}
}
