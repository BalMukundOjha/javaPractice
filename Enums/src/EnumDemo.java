
public class EnumDemo {

	public static void main(String[] args) {
		
		Databases db = Databases.MYSQL;
		System.out.println(db);
		// some methods in Enum values(); return all the enum constant.
		Databases[] values = Databases.values();
		for (Databases databases : values) {
			System.out.println(databases);
			System.out.println(databases.ordinal());
		}
	}

}
