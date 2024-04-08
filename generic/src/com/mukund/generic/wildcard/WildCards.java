package com.mukund.generic.wildcard;

import java.util.ArrayList;

public class WildCards {
	
//	public void myMethod(ArrayList<?> l) {
//		l.add(null);
//		//Get compile time error . we just insert null only
//		l.add("mukund");
//	}
	
	public void myMethod(ArrayList<? extends String> l) {
		System.out.println("inside ? extends String");
		for  (String s : l) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("muku");
		al.add("muk");
		al.add("muu");
		al.add("mukund");
		al.add("muk");
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(123);
		l.add(12);
		l.add(12356);
		
		WildCards wdCards = new WildCards();
		wdCards.myMethod(al);
		//wdCards.myMethod(l);
		
	}

}
