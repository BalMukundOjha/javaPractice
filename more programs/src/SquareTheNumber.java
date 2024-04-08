import static java.lang.System.out;
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class SquareTheNumber {

	public static void main(String[] args) {
		
		out.println("Enter number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		double sqrt2 = sqrt(num);
		System.out.println(sqrt2);
		

	}

}
