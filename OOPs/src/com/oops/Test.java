package com.oops;

public class Test {

	public static void main(String[] args) {

		
		Shape shape = new Square();
		shape.rotate();
		shape.playSound();
		
		Shape shape1 = new Circle();
		shape1.rotate();
		shape1.playSound();
		
		Shape shape2 = new Amoeba();
		shape2.rotate();
		shape2.playSound();
	}

}
