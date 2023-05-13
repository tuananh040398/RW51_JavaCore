package com.vti.backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.vti.entity.User;
import com.vti.utils.JDBCUtils;

public class UserRepository implements IUserRepository {
	@Override
	public ArrayList<User> getAllUsers() throws ClassNotFoundException, SQLException {
		ArrayList<User> users = new ArrayList<>();

		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection conn = jdbcUtils.getConnection();

		String query = "SELECT Id, Fullname, Email FROM `User`";
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(query);

		while (result.next()) {
			User user = new User(result.getInt(1), result.getString(2), result.getString(3));
			users.add(user);
		}

		jdbcUtils.disconnect();

		return users;
	}

	@Override
	public User getUserById(int id) throws ClassNotFoundException, SQLException {
		User user = null;

		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection conn = jdbcUtils.getConnection();

		String query = "SELECT Id, Fullname, Email FROM `User` WHERE Id = ?";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setInt(1, id);
		ResultSet result = statement.executeQuery();

		if (result.next()) {
			user = new User(result.getInt(1), result.getString(2), result.getString(3));
		}

		jdbcUtils.disconnect();

		return user;
	}

	@Override
	public int deleteUserById(int id) throws ClassNotFoundException, SQLException {
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection conn = jdbcUtils.getConnection();

		String query = "DELETE FROM `User` WHERE Id = ?";
		PreparedStatement statement = conn.prepareStatement(query);
		statement.setInt(1, id);
		int affectedRows = statement.executeUpdate();

		jdbcUtils.disconnect();
		
		return affectedRows;
	}

}
