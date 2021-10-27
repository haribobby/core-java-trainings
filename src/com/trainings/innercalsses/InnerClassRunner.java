package com.trainings.innercalsses;

import java.util.ArrayList;
import java.util.LinkedList;

import com.trainings.innercalsses.Outer.Inner;

public class InnerClassRunner {

	public static void main(String[] args) {
		
	
//		Outer outer = new Outer();
//		outer.display();
		
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		
		inner.display1();
		
		
//		ArrayList al = new ArrayList<>();
//		al.add("hwllo");
//		
//		al.iterator();
//		
//		
//		LinkedList<E>
		
		
	}
}

//class CustomLinkedList{
//	
//	
//	class Node{
//		
//	}
//	
//}


class Outer{
	
//	private int val;  // data/state
//	
//	public void display() { // method// member fubction
//		
//		System.out.println(val);
//	}
//	
	
	class Inner{  // member class 
		
		
		private int num = 6;
		
		public void display1() {
		
			System.out.println(num);
		}
	} 
	
	
}

