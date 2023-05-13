package com.vti.backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vti.entity.City;

public class Functions {
	public static void ShowAllCountries() {
		try {
			Connection connection = SqlFunctions.GetConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM country");
			while (resultSet.next()) {
				System.out.println(resultSet.getString("Name") + "-" + resultSet.getString("Continent"));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void AddCity(City city) {
		String insertSqlString = "INSERT INTO `city` (`Name`, `CountryCode`, `District`, `Population`)"
				+ " VALUES (?, ?, ?, ?);";

		try {
			Connection connection = SqlFunctions.GetConnection();

			PreparedStatement statement = connection.prepareStatement(insertSqlString);
			statement.setString(1, city.getNameString());
			statement.setString(2, city.getCountryCode());
			statement.setString(3, city.getDistrict());
			statement.setInt(4, city.getPopulation());

			int affectRows = statement.executeUpdate();
			System.out.println(affectRows + " City da duoc them vao CSDL.");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void UpdateCity(City city) {
		String updateSql = "Update City SET Population = ? WHERE ID = ?";

		try {
			Connection connection = SqlFunctions.GetConnection();

			PreparedStatement statement = connection.prepareStatement(updateSql);
			statement.setInt(1, city.getPopulation());
			statement.setInt(2, city.getId());
			int affectedRecords = statement.executeUpdate();
			System.out.println(affectedRecords + " city da duoc cap nhat");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void DeleteCity(City city) {
		String deleteSql = "DELETE FROM City WHERE ID = ?";

		try {
			Connection connection = SqlFunctions.GetConnection();
			PreparedStatement statement = connection.prepareStatement(deleteSql);
			statement.setInt(1, city.getId());
			int affectedRecords = statement.executeUpdate();
			System.out.println(affectedRecords + " city da bi xoa");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
