
public class ReverseArray {

	public static void main(String[] args) {

		String[] as = {"Java Web Services", "Spring Data REST", "Hibernate", "Spring in easy steps"};
		
		for(int i = as.length - 1; i>=0; i--) {
			System.out.println(as[i]);
		}
	}

}
