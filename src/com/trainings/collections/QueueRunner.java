package com.trainings.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRunner {

	
	public static void main(String[] args) {
		
		Queue q = new PriorityQueue(); // Min heap
		//Queue q = new PriorityQueue(Collections.reverseOrder()); // Max Heap
		q.add(2);
		q.add(78);
		q.add(8);
		q.add(1);
		q.add(90);
		
		
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
	}
}
