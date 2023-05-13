package com.vti.backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vti.utils.JDBCUtils;
import com.vti.entity.Admin;

public class AdminRepository implements IAdminRepository {

	@Override
	public void initData() throws ClassNotFoundException, SQLException {
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection conn = jdbcUtils.getConnection();
		
		ArrayList<Admin> admins = new ArrayList<>();
		admins.add(new Admin(1, "Nguyen Tuan Anh", "tuananh@vti.com", "123456", 10));
		admins.add(new Admin(2, "Doan Manh Dat", "manhdat@vti.com", "123456", 5));

		for (Admin admin : admins) {
			// Add user
			String query = "INSERT INTO `User`(Id, Fullname, Email, `Password`) VALUES (?, ?, ?, ?)";
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setInt(1, admin.getId());
			statement.setString(2, admin.getFullName());
			statement.setString(3, admin.getEmail());
			statement.setString(4, admin.getPassword());
			statement.executeUpdate();
			
			// Add Admin tuong ung
			String queryAdmin = "INSERT INTO `Admin`(userid, ExpInYear) VALUES (?, ?)";
			PreparedStatement statementAdmin = conn.prepareStatement(queryAdmin);
			statementAdmin.setInt(1, admin.getId());
			statementAdmin.setInt(2, admin.getExpInYear());
			statementAdmin.executeUpdate();
		}
		
		jdbcUtils.disconnect();
	}

}

