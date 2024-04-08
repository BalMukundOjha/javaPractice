
public class Test {

	public static void main(String[] args) {
		
		
		ElectricityBill bllBill = new ElectricityBill();
		ElectricityBill bllBill1 = new ElectricityBill();
		
		bllBill.setMeterNo(100);
		bllBill.setName("Mukund");
		bllBill.setAddress("15678");
		
		bllBill1.setMeterNo(100);
		bllBill1.setName("Mukund");
		bllBill1.setAddress("15678");
		
		System.out.println(bllBill);
		System.out.println(bllBill.equals(bllBill1));
		
		System.out.println(bllBill.hashCode());
		System.out.println(bllBill1.hashCode());
		
		
	}

}
