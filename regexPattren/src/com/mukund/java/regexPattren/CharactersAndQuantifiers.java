package com.mukund.java.regexPattren;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharactersAndQuantifiers {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("abc");
		Matcher m = p.matcher("abcdefghabcdefghabc");
//		while (m.find()) {
//			System.out.println(m.start());
//			System.out.println(m.end());
//			System.out.println(m.group());
//		}

		// -------------------------Meta character and
		// quantifier-------------------------------------
		// Occur only once either a or b or c
		boolean matches = Pattern.matches("[abc]?", "abc");
		//System.out.println(matches);

		// if you want atleast 1 character or more character then use "+" sign
		boolean m1 = Pattern.matches("[abc]+", "aaabb");
		//System.out.println(m1);

		// if you want least 0 character or more character then use "*" sign
		//System.out.println(m2);
		// ------------------------------------------------------------------------------------

		boolean m2 = Pattern.matches("[abc]*", "abcd");
		//System.out.println(m2);
		// ------------------------------------------------------------------------------------
		// looking for digit
		//System.out.println(Pattern.matches("\\d+", "212"));
		// looking for Not digit
		//System.out.println(Pattern.matches("\\d\\D\\D", "1ab"));
		
		// can mention exact number of character or min max we can set it out
		System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "aA1w8sdfghj"));
		// min 2 max 5 character allowed
		System.out.println(Pattern.matches("[a-zA-Z0-9]{2,5}", "aA1w8"));

	}

}
