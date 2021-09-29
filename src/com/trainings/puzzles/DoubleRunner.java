package com.trainings.puzzles;

import java.math.BigDecimal;

public class DoubleRunner {

	public static void main(String[] args) {

		double d1 = 0.8;

		double d2 = 0.1;
		
		
		System.out.println(d2-d1);
	
		BigDecimal bd1 = new BigDecimal("0.8");
		BigDecimal bd2 = new BigDecimal("0.1");

		System.out.println(bd1.subtract(bd2));
		

		// Assignment is -> why this behaviour 0.799999 ?

	}
}
