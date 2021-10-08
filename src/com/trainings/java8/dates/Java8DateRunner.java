package com.trainings.java8.dates;

import java.time.LocalDate;

public class Java8DateRunner {

	public static void main(String[] args) {

//		
//		System.out.println(LocalDate.now());
//		
//		System.out.println(LocalDateTime.now());
//		
//		
//		System.out.println(LocalTime.now());
//		

		LocalDate todayDate = LocalDate.now();

		// Add 5 days to todays date
//		System.out.println(todayDate.minusDays(5));

		System.out.println(todayDate.getDayOfMonth());
		System.out.println(todayDate.getDayOfYear());
    

	}
}