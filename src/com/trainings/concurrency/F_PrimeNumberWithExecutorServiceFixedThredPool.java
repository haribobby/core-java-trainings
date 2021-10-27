package com.trainings.concurrency;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class F_PrimeNumberWithExecutorServiceFixedThredPool {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()); // 12 threads

		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter n value for nth Prime number: ");
			int n = sc.nextInt();
			if (n == 0) {
				executorService.shutdown();
				break;
				
			}

			// Create a runnable obj
			// Creat a thread obj and pass runnable obj to thread constructor
			// start the thread

//			new Thread(() -> {
//				int number = PrimeNumberUtili.calculteNthPrimeNumber(n);
//				System.out.println("\n Value of " + n + "th prime number is: " + number);
//			}).start();

			executorService.execute(() -> {
				int number = PrimeNumberUtili9.calculteNthPrimeNumber(n);
				System.out.println("\n Value of " + n + "th prime number is: " + number);
			});

		}
	}
}

class PrimeNumberUtili9 {
	
//	i/O or CPU

	public static int calculteNthPrimeNumber(int n) { // CPU -> Choose cores ->  Runtime.getRuntime().availableProcessors()

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
	
	
	//I/O => DB calls, External system calls, File operation -> 2*Runtime.getRuntime().availableProcessors()
}
