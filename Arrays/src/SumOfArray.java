
public class SumOfArray {

	public static void main(String[] args) {

		int[] array = { 5, 3, 4, 2, 1 };
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			temp += array[i];
		}
		System.out.println(temp);
	}

}
