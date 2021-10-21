package com.trainings.concurrency;

import java.util.Scanner;

public class A_PrimeNumberWithNoConcurrency {

	public static void main(String[] args) {

		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter n value for nth Prime number: ");
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int number = PrimeNumberUtil.calculteNthPrimeNumber(n);
			System.out.println("\n Value of " + n + "th prime number is: " + number);

		}
	}
}

class PrimeNumberUtil {

	public static int calculteNthPrimeNumber(int n) {

		int number = 1;
		int numberOfPrimesFound = 0;
		int i;

		while (numberOfPrimesFound < n) {
			number++;
			for (i = 2; i < number && number % i != 0; i++) {

			}
			if (i == number) {
				numberOfPrimesFound++;
			}
		}

		return number;
	}
}
