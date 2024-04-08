import java.util.ArrayList;

public class WildCardsSuperDemo {
	
	public static void main(String[] args) {
		
		WildCardsSuperDemo wcs = new WildCardsSuperDemo();
		wcs.myMethod(new ArrayList<A>());
		
	}
	
	public void myMethod(ArrayList<? super B> l) {
		System.out.println("inside ? super B");
		l.add(null);
		l.add(new B());
	}
	
	

}
