package com.trainings.innercalsses;

public class AnonymousInnerClassRunner {

	public static void main(String[] args) {
		
		Greet gimpl = new Greet() {
			
			@Override
			public void greeting(String message) {
				System.out.println("Hi.... "+message);
					System.out.println("Hi.... "+message);	System.out.println("Hi.... "+message);
				
			}
		};
		
		gimpl.greeting("Java");

	}
}

interface Greet {

	public void greeting(String message);
}



