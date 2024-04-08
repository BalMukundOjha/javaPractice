package com.mukund.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb =  new StringBuffer();
		System.out.println("Initial capacity "+sb.capacity());
		
		sb.append("All the power is within you. ");
		sb.append("can do anything");
		System.out.println(sb);
		
		System.out.println("current capcity "+sb.capacity());
		
		//find a character at particular index
		System.out.println("Character at index 12: "+sb.charAt(12));
		
		//reverse()
		StringBuffer sb1 = new StringBuffer("abcde");
		System.out.println(sb1.reverse());
		
		
		// insert and delete a character in certain location or index
		System.out.println(sb1.insert(2, "xy"));
		System.out.println(sb1.delete(0, 4));
		
		
		
	}

}
