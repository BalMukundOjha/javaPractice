
public class PrimitiveToObject {

	public static void main(String[] args) {
		
		int x = 10;
		Integer n = Integer.valueOf(x);
		System.out.println(n);
		//--------------------------------
		
		char c = 'B';
		Character ch = Character.valueOf(c);
		System.out.println(ch);
		//------------------------------------
		boolean b = false;
		Boolean b1 = Boolean.valueOf(b);
		System.out.println(b1);

	}

}
