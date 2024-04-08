package com.mukund.flowcontrol;

public class SwitchProblem {

	public static void main(String[] args) {
		int input = 1;
		switch(input) {
		case 2:
			System.out.println("2");
			break;
		case 1:
			System.out.println("1");
		break;
		default:
			System.out.println("3");
		}

	}

}
