package com.mukund.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(140);
		list.add(105);
		list.add(70);
		list.add(80);
		list.add(110);
		list.add(100);
		
		ListIterator<Integer> listIterator = list.listIterator();	
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("===================================================");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		

	}

}
