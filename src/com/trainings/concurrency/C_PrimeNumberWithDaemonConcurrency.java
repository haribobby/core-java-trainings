package com.trainings.concurrency;

import java.util.Scanner;

public class C_PrimeNumberWithDaemonConcurrency {

	public static void main(String[] args) {

		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter n value for nth Prime number: ");
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			// Create a runnable obj
			// Creat a thread obj and pass runnable obj to thread constructor
			// start the thread

			Thread th = new Thread(() -> {
				System.out.println(n + " Thraed state is... " + Thread.currentThread().getState());
				int number = PrimeNumberUtil1.calculteNthPrimeNumber(n);
				System.out.println("\n Value of " + n + "th prime number is: " + number);
			});
		
			th.setDaemon(true);
			th.start();

		}
	}
}

class PrimeNumberUtil1 {

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
