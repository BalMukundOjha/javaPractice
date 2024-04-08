package com.mukund.comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();

//		list.add(new Student("mukund", 10, 25));
//		list.add(new Student("Rohan",  11, 27));
//		list.add(new Student("Akash",   9, 22));
//		list.add(new Student("Sadhana",13, 18));
//		Collections.sort(list);
//		list.forEach(System.out::println);
		
//		for (Student student : list) {
//			System.out.println(student.age + " " + student.name + " " + student.rollNo);
//		}
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(10, "mukund"));
		emp.add(new Employee(11, "Apple"));
		emp.add(new Employee(9, "Mangao"));
		emp.add(new Employee(13, "chiku"));
		emp.add(new Employee(3, "Apple"));
		//- sorting on Employee id
		//Collections.sort(emp, new Employee());
		//Sorting om employee name
		Collections.sort(emp, new NameComparator());
		emp.forEach(System.out::println);

	}

}
