package com.trainings.java8vslegacy;

import java.util.List;

public class B_Test {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		int result = 0;
		for (int e : numbers) {
			if (e % 2 == 0) {
				result = result + (e * 2);
			}
		}

		System.out.println(result);
		
		
		System.out.println(numbers.stream().filter(e -> e % 2 == 0).mapToInt(e -> e * 2).sum());

	}
}
