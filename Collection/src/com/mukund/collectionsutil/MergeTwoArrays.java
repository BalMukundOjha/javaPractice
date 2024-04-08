package com.mukund.collectionsutil;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
	
		 String a1[] = {"A","B","C"};
		 String a2[] = {"D","E","F"};
		 // converting a1[] in list
		 ArrayList<String> list = new ArrayList<>(Arrays.asList(a1));
		 // adding a2 in list using addAll() method
		 list.addAll(Arrays.asList(a2));
		 //converting list to array
		 Object[] a3 = list.toArray();
		 System.out.println(Arrays.toString(a3));
		

	}

}
