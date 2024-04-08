package com.mukund.java8.predicate;

import java.util.function.Predicate;

public class LengthOfStringUsingPredicate {

	public static void main(String[] args) {
		
		Predicate<String> p = s->(s.length() > 10);
		System.out.println(p.test("Mukund"));
		System.out.println(p.test("Mukund Ojha"));
		System.out.println(p.test("Bal Mukund"));
		System.out.println(p.test("Mukund        "));
	}

}
