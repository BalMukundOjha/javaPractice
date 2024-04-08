package com.mukund.flowcontrol;

public class IfElseLadder {

	public static void main(String[] args) {
		
		String choice = "Deposit Check";
		
		if(choice.equals("Check Balance")) {
			System.out.println("CHeck balance");
		}
		
		else if(choice.equals("Change Pin")) {
			System.out.println("Change Pin");
		}
		
		else if(choice.equals("Withdraw Cash")) {
			System.out.println("Withdraw Cash");
		}
		
		else if(choice.equals("Deposit Check")) {
			System.out.println("Deposit Check");
		}
		
		else {
			System.out.println("Time Out");
		}
		
		
		
		
	}

}
