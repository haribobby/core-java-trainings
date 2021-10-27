package com.trainings.concurrency;

public class WaitedTimingThreadHelloWorld {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println(Thread.currentThread().getName());
		
		Thread.sleep(10000); // 10,000 ms => 10 secs
		
		System.out.println("Hello Java!!!");
		
	}

}
