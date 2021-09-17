package com.trainings.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListRunner {

	public static void main(String[] args) {
		
		
		//CRUD
		
		// C,U,D -> Linkedlist
		//R - ArrayList

		ArrayList al = new ArrayList();
		al.add(1);
		al.add("Hello");
		al.add(new StringBuilder("builder"));
		al.add(1);
		
		System.out.println("Arraylist is before remove ..."+al);
		
		al.remove("Hello");
		
		System.out.println("Arraylist is after remove..."+al);

		// System.out.println("Arraylist is ..."+al);

		LinkedList ll = new LinkedList();
		ll.add("Hello");
		ll.add("1");
		ll.add(true);
		ll.add("Hello");
		// System.out.println("Linkedlist is ..."+ll);

		Vector v = new Vector();
		v.add("Vector");
		v.add("1");
		v.add(true);
		v.add(false);
		v.add("Vector");

	//	System.out.println("Vector is ..." + v);

		Stack s = new Stack();
//		s.add("stack");
//		s.add("1");
//		s.add(true);
//		s.add(false);
//		s.add("stack");
		s.push("3");
		s.push("1");
		s.push("2");
		
		s.pop();
		
		
		System.out.println("Stack is ..." + s);

	}
}
