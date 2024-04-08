
public class SingleInheritance {
	
	void m1() {
		System.out.println("m1 method");
	}
	
	public static void main(String[] args) {
		SingleInheritance single = new SingleInheritance();
		single.m1();
		single.getClass();
		single.hashCode();
	}

}
