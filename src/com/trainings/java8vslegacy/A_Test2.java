package com.trainings.java8vslegacy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class A_Test2 {

	public static void main(String[] args) {

		int arr[] = { -5, 4, -1, 2, -8, 5, 34, 4, 54, 5, 3 };

		System.out.println(find__(arr));

		System.out.println(IntStream.of(arr).min().getAsInt());
		System.out.println(Arrays.stream(arr).min().getAsInt());

	}

	static int find__(int numbers[]) {
		int x = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (x > numbers[i]) {
				x = numbers[i];
			}
		}
		return x;
	}

}
