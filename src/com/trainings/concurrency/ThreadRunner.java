package com.trainings.concurrency;

public class ThreadRunner {

	public static void main(String[] args) {
		
		
		System.out.println("in main() ..."+Thread.currentThread().getName());
		
		
		Task1 task1= new Task1(); // Task1 thread creation
		task1.start();
		
		
		Task2 task2= new Task2();
		Thread t2 = new Thread(task2);
		t2.start();
		
		Task3 task3= new Task3();
		Thread t3 = new Thread(task3);
		t3.start();
		
		

	}

}

class Task1 extends Thread { // Task1 is a Thread
	
	@Override
	public void run() {

		// Task1
		System.out.println("TASK1 " +Thread.currentThread().getName());
		System.out.println("Task1 Started...");
		for (int i = 1; i <= 10; i++) {

			System.out.println("Task1 " + i);
		}
		System.out.println("Task1 ended...");

	}
}

class Task2 implements Runnable {
	
	@Override
	public void run() {

		// Task2
		System.out.println("TASK2 " +Thread.currentThread().getName());
		System.out.println("Task2 Started...");
		for (int i = 11; i <= 20; i++) {

			System.out.println("Task2 " + i);
		}
		System.out.println("Task2 ended...");

	}
}

class Task3 implements Runnable {
	
	@Override
	public void run() {

		// Task3
		System.out.println("TASK3 " +Thread.currentThread().getName());
		System.out.println("Task3 Started...");
		for (int i = 21; i <= 30; i++) {

			System.out.println("Task3 " + i);
		}
		System.out.println("Task3 ended...");

	}
}
