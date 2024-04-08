package com.mukund.inheritance;

public class Test {

	public static void main(String[] args) {
		String[] project = new String[] {"Flight", "Check-In"};
		Manager m = new Manager(1, 23, "IT", 100000, project); 
		System.out.println(m.id);
		System.out.println(m.name);
		System.out.println(m.dept);
		System.out.println(m.salary);
		m.work();
		
		System.out.println("=================================");
		
		Developer d = new Developer(2, 95, "Developemnt", 200000, "Java");
		System.out.println(d.id);
		System.out.println(d.name);
		System.out.println(d.dept);
		System.out.println(d.salary);
		d.work();
	}

}
