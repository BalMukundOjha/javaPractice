package p1;

public class B {

	public static void main(String[] args) {
		
		A aObject = new A();
		 // Class A member fields a is private its not visible to classB or other classes.
//		aObject.a;
		// default package
		System.out.println(aObject.b);
		//protected
		System.out.println(aObject.c);
		//public
		System.out.println(aObject.d);
		
		
		
		
		
		
		
	}

}
