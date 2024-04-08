package abstraction;

public class ThreeSeries extends BMW {

	@Override
	void accelerate() {
		System.out.println("inside three series");
	}

	@Override
	void slow() {
		System.out.println("slow but not that much slow");
		
	}

}
