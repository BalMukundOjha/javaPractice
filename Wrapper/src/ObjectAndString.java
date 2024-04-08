 
public class ObjectAndString {

	public static void main(String[] args) {
		
		long x = 1000;
		// long to wrapper object
		Long y = Long.valueOf(x);
		
		//wrapper Object to String
		String z = y.toString();
		
		//String to wrapper object
		Long b = Long.valueOf(z);
	}

}
