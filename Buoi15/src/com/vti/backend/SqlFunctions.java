package com.vti.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlFunctions {
	
	public static Connection GetConnection() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "tuananh10");
			System.out.println("Ket noi CSDL thanh cong");
			return connection;
		} catch (SQLException e) {
			System.out.println("Ket noi CSDL that bai.");
			System.out.println(e.getMessage());
			return null;
		}
	}
}
