package com.mukund.List;

import java.util.ArrayList;
import java.util.List;

public class ALDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		// add in a list
		
		for(int i = 10; i<= 100; i = i+10) {
			list.add(i);
		}
		System.out.println(list);
		//add at particular index
		list.add(0, 0);
		System.out.println("Adding at index 0 "+list);
		
		//relpace a number from another number at particular index
		list.set(1, 5);
		System.out.println("Set element 5 at particular index 1 "+list);
		
		//add a list to another List
		List<Integer> list2 = new ArrayList<>();
		list2.add(110);
		list2.add(120);
		list2.add(130);
		list2.add(140);
		list2.add(150);
		System.out.println("list2 "+list2);
		list.addAll(6, list2);
		System.out.println("Add list2 in list "+list);
		
		//contain method to check element present in a list.
		if(list.contains(190)) {
			System.out.println("Element present in list");
		}else {
			System.out.println("not there");
		}
		
		//get() method to get element from index
		System.out.println(list.get(7));
		
		//remove() method remove from element
		System.out.println(list.remove(1));
		System.out.println(list);
	}

}
