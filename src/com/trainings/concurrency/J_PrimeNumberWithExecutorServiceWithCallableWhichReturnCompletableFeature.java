package com.trainings.concurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class J_PrimeNumberWithExecutorServiceWithCallableWhichReturnCompletableFeature {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

//		List<Future<Integer>> futureList = new ArrayList<>();
//		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//
//		
		
		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter n value for nth Prime number: ");
			int n = sc.nextInt();
			if (n == 0) {
				//executorService.shutdown();
				break;

			}

			// Create a runnable obj
			// Creat a thread obj and pass runnable obj to thread constructor
			// start the thread

//			new Thread(() -> {
//				int number = PrimeNumberUtili.calculteNthPrimeNumber(n);
//				System.out.println("\n Value of " + n + "th prime number is: " + number);
//			}).start();

//			executorService.execute(() -> {
//				int number = PrimeNumberUtili.calculteNthPrimeNumber(n);
//				System.out.println("\n Value of " + n + "th prime number is: " + number);
//			});
//			
//			Future<Integer> future = executorService.submit(() -> PrimeNumberUtili5.calculteNthPrimeNumber(n));
//			futureList.add(future);
			
			CompletableFuture.supplyAsync(() -> PrimeNumberUtili6.calculteNthPrimeNumber(n))
			.thenAccept(res -> System.out.println(res));
		}
		
//		Iterator<Future<Integer>> iterator = futureList.iterator();
//		while (iterator.hasNext()) {
//			Future<Integer> f = iterator.next();
//			if(f.isDone())
//			{
//				System.out.println( f.get());
//				iterator.remove();
//			}
//			
//		}
	}
}

class PrimeNumberUtili5 {

//	i/O or CPU

	public static int calculteNthPrimeNumber(int n) { // CPU -> Choose cores ->
														// Runtime.getRuntime().availableProcessors()

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

	// I/O => DB calls, External system calls, File operation ->
	// 2*Runtime.getRuntime().availableProcessors()
}
