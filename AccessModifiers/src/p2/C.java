package p2;
import p1.A;

public class C extends A {

	public static void main(String[] args) {
		
		A obj = new A();
		System.out.println(obj.d);
		//cannot access c variables from class A cause c is procted so from child class you can access
		// create child class object and child class must extends A class.
		C c = new C();
		System.out.println(c.c);
		
	}

}
