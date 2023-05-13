package com.vti.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlFunctions {
	public static Connection Q1_getConnection() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing_system_assignment_1", "root", "tuananh10");
			System.out.println("Connect Success!");
			return connection;
		} catch (SQLException e) {
			System.out.println("Access Denied");
			System.out.println(e.getMessage());
			return null;
		}
	}
}
