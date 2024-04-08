package com.mukund.Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithString {

	public static void main(String[] args) {
		
		
		Set<String> treeSet = new  TreeSet<String>();
		treeSet.add("Abhi");
		treeSet.add("dbhi");
		treeSet.add("cbhi");
		treeSet.add("bbhi");
		Iterator<String> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		
		
		
		
	}

}
