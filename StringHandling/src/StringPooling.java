
public class StringPooling {

	public static void main(String[] args) {
		
		String s = "mukund";
		String s1 = "Bal";
		String s3 = "bal";
		String s4 = "mukund";
		
		String s5 = new String("mukund");
		String s6 = new String("mukund").intern();
		
//		System.out.println(s == s1);//false
//		System.out.println(s1 == s3);//false
//		System.out.println(s == s3);//false
//		System.out.println(s == s4);//true
//		
		System.out.println("============================================");
		
		System.out.println(s == s6);
		
	}

}
