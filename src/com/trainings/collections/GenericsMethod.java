package com.trainings.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GenericsMethod {

	public static void main(String[] args) {

		System.out.println(getList());
	}

//	static List<? extends Number> getList(List<? extends Number> list) {
//
//
//		
//		return list;
//	}
	
	
	static <T> List<T> getList() {
		
		
		
		
		List<String> list = new ArrayList<String>();
		list.add("sdfsf");
		
		
		return (List<T>) list; 
		
		
		
		
		
	}
		
	
}



