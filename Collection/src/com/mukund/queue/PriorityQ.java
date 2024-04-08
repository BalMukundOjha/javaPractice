package com.mukund.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {

	public static void main(String[] args) {
		
		Queue<Integer> q = new PriorityQueue<Integer>();
		//return head element and if no element return null
		System.out.println(q.peek());
		//same as peek() method but no element it will throw exception NoSuch Elemnet
		//System.out.println(q.element());
		for(int i =10; i<= 20; i++) {
			q.offer(i);
		}
		System.out.println(q);
		//poll mentod removes head of q or return null if queue is empty
		// return the elemnt which is removed
		System.out.println(q.poll());
		System.out.println(q);
		//same sa poll but throw exception if q is empty
		System.out.println(q.remove());
		System.out.println(q);
	}

}
