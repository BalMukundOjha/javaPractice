package com.mukund.java.regexPattren;

import java.util.regex.Pattern;

public class SplitDemo {

	public static void main(String[] args) {
		
		//Pattern p = Pattern.compile("\\s");
		//Pattern p = Pattern.compile("\\.");
		Pattern p = Pattern.compile("[.-]");
		String[] words = p.split("www-balmukund-com");
		for(String word: words) {
			System.out.println(word);
		}
		
	}

}
