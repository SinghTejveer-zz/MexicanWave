package com.maxicanwave.utill;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DBManager {
	
	final private static String USER = "root";
	final private static String PASS = "";
	final private static String DATABASE = "maxicanwave";
	final private static String CLASS = "com.mysql.jdbc.Driver";
	final private static String URL = "jdbc:mysql://localhost:3306/";
	Connection connection = null;

	
	public Connection getConnection()
	{
		System.out.println("-------- MySQL JDBC Connection Testing ------------");

		try {
			Class.forName(CLASS);
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return connection;
		}

		System.out.println("MySQL JDBC Driver Registered!");

		try {
			connection = DriverManager
			.getConnection(URL+DATABASE,USER, PASS);

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return connection;
		}

		if (connection != null) {
			System.out.println("Success to make connection!");
		} else {
			System.out.println("Failed to make connection!");
		}
		return connection;
		
	}
}
