package com.mukund.generic;

public class MyGeneric<T> {
	
	T obj;

	public MyGeneric(T obj) {
		this.obj = obj;
	}
	
	public void displayOject() {
		System.out.println("Type of object: "+obj.getClass().getName());
	}
	
	public T getObject() {
		return obj;
	}
	
	

}
