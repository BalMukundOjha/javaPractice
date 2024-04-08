import java.util.Iterator;

public class removeAllDigit {

	public static void main(String[] args) {
		System.out.println("-------------Method1 using toCharArray--------------------");
		String s1 = "123Mukund876";
		String result = "";
		char[] ch1 = s1.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			if (!Character.isDigit(ch1[i])) {
				result += ch1[i];
			}
		}
		System.out.println(result);
		
		System.out.println("----------Method2 Using CharAt----------------------------");
		
		String s = "34Mukund123";
		String res = "";
		for(int i =0; i<s.length(); i++) {
			if(!Character.isDigit(s.charAt(i))) {
				res += s.charAt(i);
			}
		}
		System.out.println(res);
		
		
	}

}
