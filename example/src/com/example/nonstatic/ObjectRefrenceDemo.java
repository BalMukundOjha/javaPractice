package com.example.nonstatic;

public class ObjectRefrenceDemo {

	int x;

	public ObjectRefrenceDemo() {

	}

	public static void main(String[] args) {
		ObjectRefrenceDemo ord = new ObjectRefrenceDemo();
		System.out.println(ord.x);
	}

}
