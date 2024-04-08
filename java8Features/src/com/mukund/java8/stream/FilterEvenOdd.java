package com.mukund.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterEvenOdd {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(34);
		list.add(40);
		list.add(27);
		list.add(20);
		list.add(50);

		Predicate<Integer> predicate = i -> (i % 2 == 0);
		//filter to a stream
		List<Integer> collect = list.stream().filter(predicate).collect(Collectors.toList());
		System.out.println(collect);

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("MUKUND");
		list1.add("OJHA");
		list1.add("BAL");
		list1.add("SADHANA");
		//Map to stream
		List<String> collect2 = list1.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
		System.out.println(collect2);
		
		//other method in stream
		
		long count = list.stream().filter(predicate).count();
		System.out.println(count);
		
		
		List<Integer> sort = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
		
		
		List<Integer> sotredEvenIntegers = list.stream().filter(predicate).sorted().collect(Collectors.toList());
		System.out.println("Even number Sorted:  "+sotredEvenIntegers);
		
		Comparator<Integer> comparator = (i1, i2) -> i1.compareTo(i2);
		List<Integer> sotredEvenUsingComparator = list.stream().filter(predicate).sorted(comparator).collect(Collectors.toList());
		System.out.println("Even number Sorted using Comparator:  "+sotredEvenUsingComparator); 
		
		list.stream().forEach(i->System.out.println(i));
		
		// count(), max,min todo
		
		
	}

}
