

public class FiveWithZero {

	public static void main(String[] args) {

		int[] arr = { 3, 5, 6, 3, 5, 7 };

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 3 && arr[i + 1] == 5) {
				arr[i + 1] = 0;
			}
		}
		for(int element : arr) {
			System.out.print(element);
		}
		

	}

}
