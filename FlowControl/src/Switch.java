
public class Switch {

	public static void main(String[] args) {
		
//		String string = "";
//		
//		switch(string){
//		
//		case "one":
//			System.out.println("Case one executed");
//			break;
//			
//		case "Two":
//			System.out.println("Case Two executed");
//			break;	
//			
//		case "Three":
//			System.out.println("Case Three executed");
//			break;
//			
//		default:
//			System.out.println("No Case Default block executed");
//		
//		}
		
		// if you want to same logic for more than one case 
		
		int x = 1;
		
		switch(x){
		
		case 1:
		case 2:
			System.out.println("Case Two executed");
			break;	
			
		case 3:
			System.out.println("Case Three executed");
			break;
			
		default:
			System.out.println("No Case Default block executed");
		
		}

	}

}
