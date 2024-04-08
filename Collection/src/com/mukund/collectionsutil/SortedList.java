package com.mukund.collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedList {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		l.add("max");
		l.add("l");
		l.add("you");
		l.add("zebr");
		l.add("appl");
		l.add("ed");
		l.add("cbi");
		l.add("c");
		System.out.println("Before Sorting: "+l);
		Collections.sort(l, new MyComparator());
//		System.out.println("After Sorting: "+l);
		int binarySearch = Collections.binarySearch(l, "cbi");
		System.out.println(binarySearch);
		
	}

}

class MyComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}

}
