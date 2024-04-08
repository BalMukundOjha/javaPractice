package com.mukund.java8.predicateJoins;

import java.util.function.Predicate;

public class PredicateJoins {

	public static void main(String[] args) {
		
		int[] x = {10,20,30,50,7,73,40,53,9,5};
		
		Predicate<Integer> p = i ->(i > 10);
		Predicate<Integer> p1 = i->(i%2==0);
		System.out.println("Greater than 10: ");
		PredicateJoins.myMethod1(p, x);
		
		System.out.println("Even number: ");
		PredicateJoins.myMethod1(p1, x);
		
		System.out.println("not greater than 10:");
		PredicateJoins.myMethod1(p.negate(), x);
		
		System.out.println("Greater than 10 and Even: ");
		PredicateJoins.myMethod1(p1.and(p), x);
		
		System.out.println("Greater than 10 or Even: ");
		PredicateJoins.myMethod1(p1.or(p), x);
	}
	
	
	
	static void myMethod1(Predicate<Integer>p,int[] x) {
		
		for (int i : x) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}

}
