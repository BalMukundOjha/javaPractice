package com.mukund.java8.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		// wap to find given number is greater than 20 or not using predicate.
		
		Predicate<Integer> p = i ->(i>20);
		boolean test = p.test(56);
		System.out.println(test);
		System.out.println(p.test(21));
		System.out.println(p.test(26));
		System.out.println(p.test(2));
		
	}

}
