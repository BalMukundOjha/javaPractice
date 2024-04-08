package com.exception.customexceptions;

public class UncheckedCustomException extends RuntimeException {
	// its unchecked exception so compiler will not check.
	public UncheckedCustomException(String msg) {
		super(msg);
	}

}
