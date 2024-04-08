package com.mukund.navigable;

import java.util.TreeSet;

public class NavigableSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> n = new TreeSet<>();
		
		n.add(10);
		n.add(40);
		n.add(19);
		n.add(55);
		n.add(34);
		n.add(51);
		
		System.out.println(n);
		//Returns the least element in this set greater than or equal to the given element,  
		//or null if there is no such element.
		System.out.println(n.ceiling(50));
		
		//Returns the least element in this set strictly greater than the given element, 
		//or null if there is no such element.
		System.out.println(n.higher(39));
		//Returns the greatest element in this set less than or equal to the given element, 
		//or null if there is no such element.
		System.out.println(n.floor(20));
		//Returns the greatest element in this set strictly less than the given element,  
		//or null if there is no such element.
		System.out.println(n.lower(20));
		//Retrieves and removes the first (lowest) element,
		//or returns null if this set is empty.
		System.out.println(n.pollFirst());
		System.out.println(n.pollLast());
		
		
		
	}

}
