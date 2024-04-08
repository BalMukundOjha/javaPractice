package com.mukund.flowcontrol;

public class SwitchCase {

	public static void main(String[] args) {
		int x = 30;
		final int z = 10;
		// In swtich case we cannot use variable it will throw CTE always use Constant. But if we use final keyword then it consider as constant.
		// DUplicate case not allowed
		switch(z+1) {
		case 20:
			System.out.println("Case 20");
			break;
		case 30:
			System.out.println("Case 30");
			break;
		case z:
			System.out.println("case z");
			break;	
		case z+1:
			System.out.println("case z+1");
			break;		
		default:	
			System.out.println("Default");
			
		}
	}

}