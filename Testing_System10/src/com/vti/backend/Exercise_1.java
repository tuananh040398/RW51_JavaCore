package com.vti.backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vti.entity.Position;

public class Exercise_1 {
	public static void Q2_ShowPosition() {
		try {
			Connection connection = SqlFunctions.Q1_getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM position");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("positionID") + "-" + resultSet.getString("positionName"));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void Q3_AddPosition(Position position) {
		String insertSqlString = "INSERT INTO `position` (`positionName`)" + " VALUE (?);";

		try {
			Connection connection = SqlFunctions.Q1_getConnection();

			PreparedStatement statement = connection.prepareStatement(insertSqlString);
			statement.setString(1, position.getPositionName());

			int affectRows = statement.executeUpdate();
			System.out.println(affectRows + " Position đã được thêm vào CSDL");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void Q4_UpdatePosition(Position position) {
		String updateSql = "Update Position SET PositionName = ? WHERE positionID = ?";

		try {
			Connection connection = SqlFunctions.Q1_getConnection();
			PreparedStatement statement = connection.prepareStatement(updateSql);
			statement.setString(1, position.getPositionName());
			statement.setInt(2, position.getPositionID());
			int affectedRecords = statement.executeUpdate();
			System.out.println(affectedRecords + " Position da duoc cap nhat");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void Q5_DeletePosition(Position position) {
		String deleteSql = "DELETE FROM Position WHERE positionID = ?";

		try {
			Connection connection = SqlFunctions.Q1_getConnection();
			PreparedStatement statement = connection.prepareStatement(deleteSql);
			statement.setInt(1, position.getPositionID());
			int affectedRecords = statement.executeUpdate();
			System.out.println(affectedRecords + " Position da bi xoa");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
