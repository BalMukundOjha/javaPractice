package abstraction;

public class Test {
	
	public static void main(String[] args) {
		
		ThreeSeries th = new ThreeSeries();
		th.accelerate();
		th.commonfunction();
		th.brake();
		th.slow();
		
		FiveSeries fv = new FiveSeries();
		fv.accelerate();
		fv.commonfunction();
		fv.slow();
		fv.brake();
	}

}
