package finalconcept;

public class A {

	final static float pi = 3.15f;

	public static void main(String[] args) {
		  A a = new A();
		//we are changing pi value. so if you don't want to change 
		// pi value mark varible as final
		//a.pi = 3.19f;
		System.out.println(A.pi);
		
	}
	
	public final void displayValue() {
		System.out.println("Displaying value "+A.pi);
	}

}
