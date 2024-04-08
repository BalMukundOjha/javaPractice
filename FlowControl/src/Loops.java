
public class Loops {

	public static void main(String[] args) {
		System.out.println("=================For Loop=======================");
		for (int i = 1; i < 100; i++) {

			if (i == 100) {
				break;
			}
			if (i % 10 == 0) {
				continue;
			}
			System.out.println(i);

		}

		System.out.println("===============While Loop=======================");
		int j = 1;

		while (j < 150) {

			if (j % 10 == 0) {
				j++;
				continue;
			}

			if (j > 100) {
				break;
			}

			System.out.println(j++);
		}

		System.out.println("==================Do While Loop========== ==========");
		int x = 1;
		do {
			if(x >= 100) {
				break;
			}
			
			if(x % 10 == 0) {
				x++;
				continue;
			}
			
			System.out.println(x++);
		}while(x < 150);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
