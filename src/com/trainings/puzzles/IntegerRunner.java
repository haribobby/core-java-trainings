package com.trainings.puzzles;

public class IntegerRunner {

	public static void main(String[] args) {

		// == => reference comparision
		// .equals => content comaprision

		Integer i1 = 100;
		Integer i2 = 100;
		
		
	
		if (i1.equals(i2)) {
			System.out.println("IF: Both objects content is EQUAL");
		} else {
			System.out.println("ELSE: Both objects content is NOT EQUAL");
		}

		if (i1 == i2) {
			System.out.println("IF: Both objects references are EQUAL");
		} else {
			System.out.println("ELSE: Both objects references are NOT EQUAL");
		}

	}
}
