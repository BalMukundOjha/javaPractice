package com.mukund.comparable_Comparator;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {

		Set<String> ts = new TreeSet<>(new ComparatorString());
		ts.add("Apple");
		ts.add("Mangao");
		ts.add("Chik");
		ts.add("Bananaa");

		
		System.out.println(ts);

	}

}
