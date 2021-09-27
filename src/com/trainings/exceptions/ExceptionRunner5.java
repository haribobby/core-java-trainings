package com.trainings.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionRunner5 {

	public static void main(String[] args) throws IOException {

		String fileName = "src/com/trainings/exceptions/lines.txt";
		BufferedReader br = null;
		try {	
			System.out.println("try block()");
			br = new BufferedReader(new FileReader(fileName));

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			System.out.println("Catch block()");
			e.printStackTrace();
		} finally {

			System.out.println("finally block()");
			if (br != null) {
				br.close();
			}

		}
		
		
		
		//try with resource
//		
//		try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {	
//			System.out.println("try block()");
//			
//
//			String line;
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//
//		} catch (IOException e) {
//			System.out.println("Catch block()");
//			e.printStackTrace();
//		} 

	}

}
