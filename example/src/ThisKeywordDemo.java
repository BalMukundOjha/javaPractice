
public class ThisKeywordDemo {

	int x;

	// this refer to a current object and it always use in non static context
	// For example we can't use in main method because main method is a static.
	public ThisKeywordDemo() {
		System.out.println(this);
		System.out.println(this.x + " this refer to obj");
	}

	public static void main(String[] args) {
		new ThisKeywordDemo();
		new ThisKeywordDemo();
	}

}
