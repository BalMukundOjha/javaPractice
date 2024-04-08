package com.mukund.collectionsutil;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
	
		String[] s = { "V", "A", "Z", "P" };
		List<String> asList = Arrays.asList(s);
		System.out.println(asList);
		s[1] = "Y";
		System.out.println(asList);
		// get unsuported Exception
		asList.add("o");
		

	}

}
