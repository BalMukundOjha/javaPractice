package com.mukund.java.textfileFinder;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFileFinder {

	public static void main(String[] args) {

		File dir = new File("D:\\");
		String[] fileNames = dir.list();
		for (String string : fileNames) {
			System.out.println("File: "+ string);
		}
		
		Pattern p = Pattern.compile("[a-zA-Z0-9\\s()]+[.]txt");
		int count = 0;
		System.out.println("After count===============================");
		for (String fn : fileNames) {
			Matcher m = p.matcher(fn);
			if(m.matches()) {
				count++;
				System.out.println(fn);
			}
			
		}

	}

}
