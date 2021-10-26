package com.trainings.concurrency;

import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class J_CompletableFeature {

	public static void main(String[] args) {

		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter n value for nth Prime number: ");
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}


//			new Thread(() -> {
//				int number = PrimeNumberUtili4.calculteNthPrimeNumber(n);
//				System.out.println("\n Value of " + n + "th prime number is: " + number);
//			}).start();

			
			CompletableFuture.supplyAsync(() -> PrimeNumberUtili4.calculteNthPrimeNumber(n))
			.thenAccept(res -> System.out.println(res));


		}
	}
}

class PrimeNumberUtili4 {

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
