package com.exception;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			String input = args[0];
			System.out.println("Input is " + input);
			int output = Integer.parseInt(input);
			System.out.println("Output is " + output);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Input is require");
		} catch (NumberFormatException e) {
			System.out.println("invalid input provided");
	}  catch (Exception e) {
			System.out.println("Exception catch block");
		}
		
		System.out.println("More code go here");

	}

}
