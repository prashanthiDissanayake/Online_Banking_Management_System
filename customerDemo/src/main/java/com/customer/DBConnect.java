package com.customer;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	

	private static String url = "jdbc:mysql://localhost:3306/oop_project";
	private static String UserName = "root";
	private static String password = "0716578924@ABc";
	private static Connection con;
	
	public static Connection getConnection() {
		

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, UserName, password);
			
		}
		catch (Exception e) {
			System.out.println("Database connection is not success!!!");
		}
		
		return con;
	
	}

}
