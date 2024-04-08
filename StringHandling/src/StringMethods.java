import javax.xml.ws.AsyncHandler;

public class StringMethods {

	public static void main(String[] args) {
		
		
		String s = "Hello Mukund whats is u? 234";
		String s1 = "Hello Hi BalMukund Ojha";
		
		//find the String length
		System.out.println("Length of a String is: "+s.length());
		
		//find index of a particular Character
		System.out.println("String character 2 index: "+s.indexOf('2'));
		System.out.println("String character ? index: "+s.indexOf('?'));
		
		// find out a character at particular index by passing index.no
		System.out.println("charAt index 22: "+s.charAt(22));
		
		// sub String method
		System.out.println("subString with begining index: "+s.substring(6));
		System.out.println("subString begining and end index.no: "+s1.substring(6, 23));
		System.out.println("subString begining and end index.no: "+s1.substring(9, 18));
		
		// Split method --> return an arry of String
		String[] sliptt = s.split(" ");
		for (int i = 0; i < sliptt.length; i++) {
			System.out.println(sliptt[i]);
		}
		
		//replace method
		String replace = s.replace('?', '#');
		System.out.println(replace);
		
		//to_uppercase and to_lowercase
		
	}

}
