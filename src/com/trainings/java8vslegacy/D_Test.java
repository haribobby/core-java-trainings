package com.trainings.java8vslegacy;

import java.util.stream.IntStream;

public class D_Test {

	public static void main(String[] args) {

		System.out.println(is__(1));
		System.out.println(is__(2));
		System.out.println(is__(8));
		System.out.println(is__(7));

	}

	static boolean is__(int n) {

		if (n <= 1)
			return false;

		else if (n == 2)
			return true;

		else if (n % 2 == 0)
			return false;

		for (int i = 3; i < n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static boolean isA__(int n) {
		return n > 1 && IntStream.range(2, n).noneMatch(index -> n % index == 0);

	}

}
