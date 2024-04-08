package com.mukund.Set;

import java.util.Set;
import java.util.TreeSet;

import com.mukund.comparable_Comparator.SBCOmparator;

public class StringBufferTreeSet {

	public static void main(String[] args) {
		
		
		Set<StringBuffer> tsb  = new TreeSet<>(new SBCOmparator());
		tsb.add(new StringBuffer("ABC"));
		tsb.add(new StringBuffer("EFG"));
		tsb.add(new StringBuffer("BND"));
		tsb.add(new StringBuffer("XKJ"));
		
		for (StringBuffer sb : tsb) {
			System.out.println(sb);
		}
		
		
		
		
	}

}
