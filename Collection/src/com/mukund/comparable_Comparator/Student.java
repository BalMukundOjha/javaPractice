package com.mukund.comparable_Comparator;

public class Student implements Comparable<Student> {
	String name;
	int rollNo;
	int age;

	public Student(String name, int rollNo, int age) {
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}

//	@Override
//	public int compareTo(Student st) {
//		if(st.age == age) {
//			return 0;
//		}else if(st.age > age){
//			return 1;
//		}else {
//			return -1;
//		}
//	}
	@Override
	public int compareTo(Student st) {
		int s1 = this.age;
		int s2 = st.age;
		if (s1 == s2) {
			return 0;
		} else if (s1 < s2) {
			return -1;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", age=" + age + "]";
	}

}
