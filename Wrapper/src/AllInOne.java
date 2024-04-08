
public class AllInOne {

	public static void main(String[] args) {

		int x = 100;
		// Premitive type converted in Wapper Object
		Integer y = Integer.valueOf(x);
		// Convert this wrapper object to primitive type
		int z = y.intValue();
		// =================================================

		String string = "100";
		// Convert String type to Object type
		Integer v = Integer.valueOf(string);
		// convert to object to String type
		String s = v.toString();
		
		//=====================================================
		int u = 20;
		// Convert Primitive to String
		String n = Integer.toString(u);
		//Convert String to Primitive
		int m = Integer.parseInt(s);
		//========================================================
		// convert primitive to wrapper object using constructor
		int t = 100;
		Integer integer = new Integer(t);
		//convert String to wrapper object
		String s1 = "500";
		Integer integer2 = new Integer(s1);
		
		

	}

}
