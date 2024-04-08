package encapsulation;

public class Test {

	public static void main(String[] args) {
		
		Patient patient = new Patient();
		patient.setId(123);
		patient.setName("Bhatath");
		patient.setSsn("1234567890");
		
		
		System.out.println(patient.getId());
		System.out.println(patient.getName());
		System.out.println(patient.getSsn());
	}

}
