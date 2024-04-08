package com.mukund.comparable_Comparator;

import java.util.Comparator;

public class SBCOmparator implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
		// it return +ve value if s1 come first in natural order
		//-ve value if s2 come first
		// both same then return 0
	}

	
	
	

	

}
