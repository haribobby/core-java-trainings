package com.trainings.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class I_Callable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
//
//		Runnable r1 = new Runnable() {
//
//			@Override
//			public void run() {
//				
//				// calling db 
//				// return the data 
//				
//				System.out.println(" In runnbale");
//
//			}
//		};
//
//		
//		new Thread(r1).start();
		
		
		
		
		Callable<String> c1  = new Callable<String>() {

			@Override
			public String call() throws Exception {
				
				//task 10 sec
				
				Thread.sleep(10000);
				return "data from db";
			}
		};
		
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		Future<String> f = executorService.submit(c1);
		
		System.out.println(f);
		
		System.out.println(f.get());
		
		System.out.println(f);
		
		executorService.shutdown();
	}
	

}
