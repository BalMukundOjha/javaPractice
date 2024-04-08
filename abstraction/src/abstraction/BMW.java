package abstraction;

public  abstract class BMW {
	
	void commonfunction() {
		System.out.println("inside commonfunction method");
	}
	
	abstract void accelerate();
	abstract void slow();
	
	void brake() {
		System.out.println("brake it");
	}
//	public static void main(String[] args) {
//		System.out.println("inside a main method");
//	}

}
