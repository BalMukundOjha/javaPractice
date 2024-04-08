package com.mukund.List;

import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		Object obj[] = new Object[10000000];
		for (int i = 0; i < obj.length; i++) {
			obj[i] = new Object();
		}

		List<Object> l = new LinkedList<>();
		//List<Object> l = new ArrayList<>();
		long start = System.currentTimeMillis();
		for (Object object : l) {
			l.add(object);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken: "+(end - start));
		
	}

}
