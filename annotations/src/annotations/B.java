package annotations;

public class B {
	
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		System.out.println(a);
	}

}
