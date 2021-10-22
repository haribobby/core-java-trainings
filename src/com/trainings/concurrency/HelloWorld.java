package com.trainings.concurrency;

public class HelloWorld {
	
	
	private int i =0;

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println(Thread.currentThread().getName());


		System.out.println("Hello Java!!!");
		
	}

}

//
//12 cores  - 12 threads paralley executes piece of taks
//12 cores -> 13 threads -> 12 
