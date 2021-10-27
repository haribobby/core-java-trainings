package com.trainings.wrapprclasses;

public class WrapperClassRunner {
	
	
	int a;
	Integer i;
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "WrapperClassRunner [a=" + a + ", i=" + i + "]";
	}







	public static void main(String[] args) {
		
		
		WrapperClassRunner runner = new WrapperClassRunner();
		
		
		System.out.println(runner);
		
		
		
		int a = 10;
	
		
		Integer i = 10; // Autoboxing
		
		Integer i1 = Integer.valueOf(20);
		
		
		int b = i1;  // Auto-unboxing
		int b1 = i1.intValue();
		
	
		
		float f =2.2f;
		
		Float fw = 2.2f;
		
		double d = 2.7;
		Double dw = 2.7;
		
		boolean b11 = true;
		
		char c = 'c';
		
		
		
	}

}
