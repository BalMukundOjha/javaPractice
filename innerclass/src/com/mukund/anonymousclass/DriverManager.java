package com.mukund.anonymousclass;

public class DriverManager {
	
	static Connection getConnection() {
		Connection connection = new Connection() {	
			@Override
			public void createStatment() {
				System.out.println("Anonymous inner classes method");
			}
		};
		return connection;
	}
}
