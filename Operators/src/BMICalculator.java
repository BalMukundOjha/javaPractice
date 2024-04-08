
public class BMICalculator {

	public static void main(String[] args) {
		//bmi = weight in kg/(height * height)
		double height = 5.11;
		double weight = 120;
		double heightInMeters = height * 0.4536;
		
		double bmi = weight /(heightInMeters * heightInMeters);
		System.out.println(bmi);
	}

}
