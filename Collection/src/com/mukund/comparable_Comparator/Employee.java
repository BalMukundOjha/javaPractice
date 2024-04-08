package com.mukund.comparable_Comparator;

import java.util.Comparator;

public class Employee implements Comparator<Employee>  {
	
	int id;
	String name;
	
	Employee(){}
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.id < o2.id) return -1;
		else if(o1.id > o2.id) return 1;
		else return 0;
	}
	
	

}
