package com.exception.customexceptions;

public class Test {

	public static void main(String[] args) throws CheckedException {
		//throw new UncheckedCustomException("Business Exception occured");
		
		//getting error add throws in main method 
		throw new CheckedException("Business exception thats need to be handled");
	}

}
