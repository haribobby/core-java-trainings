package com.trainings.concurrency;

class Counter implements Runnable {

	private int counter; // 0

	private void decrement() {
		counter--;
	}

	private void increment() {
		counter++;
	}

	@Override
	public void run() {
		
	
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}

		this.decrement(); // -1

		this.increment(); // 0

		System.out.println("Final Counter value for " + Thread.currentThread().getName() + " is:: " + counter); // 0

	}

}

public class D_WithoutSynchronization {

	public static void main(String[] args) {

		Counter counter = new Counter();

		Thread th1 = new Thread(counter, "Thread1");
		Thread th2 = new Thread(counter, "Thread2");
		Thread th3 = new Thread(counter, "Thread3");
		Thread th4 = new Thread(counter, "Thread4");

		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}

}
