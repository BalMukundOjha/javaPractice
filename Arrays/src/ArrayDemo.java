
public class ArrayDemo {

	public static void main(String[] args) {
		
		//int arr[] = {10,20,40,50};
		
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = new Integer(90);//Autoboxing
		arr[2] = 70;
		arr[3] = 101;
		arr[4] = 120;
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		for (int i : arr) {
//			System.out.println(i);
//		}
//		
//		long[] arr1 = new long[5];
//		for(long e : arr1) {
//			System.out.println(e);
//		}
		
		// two dimensionarray
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i = 0; i<matrix.length; i++) {
			for(int j = 0; j< matrix.length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
	}

}
