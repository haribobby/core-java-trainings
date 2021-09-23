package com.trainings.collections;

import java.util.ArrayList;

public class GenricRunner3 {

	public static void main(String[] args) {
//
//		MyCustomList<String> strlist = new MyCustomList<String>();
//		strlist.addElement("Apple");
//		strlist.addElement("Banana");
//		strlist.addElement("Carrot");
		
	//	System.out.println(strlist);


		MyCustomList<Integer> intlist = new MyCustomList<Integer>();
		intlist.addElement(1);
		intlist.addElement(2);
		
		
		System.out.println(intlist);
		
		MyCustomList<Double> dobletlist = new MyCustomList<Double>();
		dobletlist.addElement(1.0);
		dobletlist.addElement(2.0);
		
		System.out.println(dobletlist);
		
		
		MyCustomList<Long> longlist = new MyCustomList<Long>();
		longlist.addElement(100l);
		longlist.addElement(200l);
		
		System.out.println(longlist);


	}
}

class MyCustomList<T extends Number> { // upper bound

	ArrayList<T> list = new ArrayList<>();

	void addElement(T data) {
		list.add(data);
	}

	void removeElement(T data) {
		list.remove(data);
	}

	T get(int index) {

		return list.get(index);
	}

	@Override
	public String toString() {
		return "MyCustomList [list=" + list + "]";
	}

}