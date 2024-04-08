package com.mukund.java.regexPattren;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatedEmail {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+$");
		Matcher matcher = pattern.matcher("balmukund_ojha@gmail");
		if(matcher.matches()) {
			System.out.println("Valid Email");
		}else {
			System.out.println("Not a Valid Email");
		}
		
		// Email valid using String
		String email1 = "balmukund_ojha@gmail.com";
		if (email1.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+$")) {
			System.out.println("Valid Email ID");
		}else {
			System.out.println("Not a Valid Email Id");
		}

	}

}
