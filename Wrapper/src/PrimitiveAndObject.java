
public class PrimitiveAndObject {

	public static void main(String[] args) {
		
		int x = 10;
		//converting Primitive int to Wapper Integer
		Integer y = Integer.valueOf(x);
		System.out.println("Primitive to wrapper "+y);
		//converting Wapper Integer to Primitive int
		int z = y.intValue();
		System.out.println("Wrapper to Primitive "+z);
	}

}
