
public class ObjectToPrimitive {

	public static void main(String[] args) {
		
		Integer x = 10;
		int intValue = x.intValue();
		//System.out.println(intValue);
		//-------------------------------
		Integer i = new Integer(20);
		System.out.println(i);
		int intValue2 = i.intValue();
		System.out.println(intValue2);
		//-------------------------------
		
		Boolean boolean1 = new Boolean(true);
		System.out.println(boolean1);
		boolean booleanValue = boolean1.booleanValue();
		System.out.println(booleanValue);
		
		
	}

}
