
public class StaticNonStaticFlowDemo {
	
	public StaticNonStaticFlowDemo() {
	//System.out.println("Constructor created");
	}

//	static int x =10;
//	int y = 20;
//
//	static {
//		System.out.println("Static block 1");
//		
//	}
//	
//	static {
//		System.out.println("Static block 2");
//		
//	}
//	
//	
//	static void m1() {
//		System.out.println("static method");
//	}
	
	//----------------------------------------Non static-------------------------------------------------------
//	{
//		System.out.println("Non Static block 1");
//	}
//	
//	{
//		System.out.println("Non Static block 2");
//	}
//	
//	void m2() {
//		System.out.println("Non static method");
//	}
	
	
	//-------------------------------------------Object Creation static and non static--------------------------------------------------------
	
	//static StaticNonStaticFlowDemo snf;
	
	static {
		StaticNonStaticFlowDemo snf = new StaticNonStaticFlowDemo();
		System.out.println("static block: "+snf);
	}
	
	{
		System.out.println("non static block");
	}
	
	
	
	
	public static void main(String[] args) {
		
		

	}

}
