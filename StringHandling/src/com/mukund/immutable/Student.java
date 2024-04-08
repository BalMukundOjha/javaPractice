package com.mukund.immutable;

final class Student {

	private final int roll_no;

	public Student( int roll_no) {
		this.roll_no = roll_no;
	}

	public Student myImmutable(int roll_no) {
		if (this.myImmutable(roll_no) == this) {
			return this;
		} else {
			return new Student(roll_no);
		}

	}
	
	public static void main(String[] args) {
		Student student = new Student(30);
		System.out.println(student.getRoll_no());
		Student student1 = new Student(30);
		System.out.println(student == student1);
		
	}

	public int getRoll_no() {
		return roll_no;
	}

}
