package com.mukund.collectionsutil;

import java.util.Arrays;

public class ArraysBinarySearch {

	public static void main(String[] args) {
		String[] s = { "V", "A", "Z", "P" };
		String target = "Z";
		int index = Arrays.binarySearch(s, target);
		if (index >= 0) {
            System.out.println("The string " + target + " is found at index " + index);
        } else {
            System.out.println("The string " + target + " is not found in the array");
        }
	}

}
