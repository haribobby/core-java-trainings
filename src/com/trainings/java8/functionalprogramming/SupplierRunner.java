package com.trainings.java8.functionalprogramming;

import java.util.function.Supplier;

public class SupplierRunner {

	public static void main(String[] args) {
		
//		
//		Supplier<String> supplierAn = new Supplier<String>() {
//
//			@Override
//			public String get() {
//				// TODO Auto-generated method stub
//				return "I am supplying water";
//				
//			}
//		};
		
		Supplier<String> supplier = () ->  "I am supplying water";
		
		System.out.println(supplier.get());
	}
}
