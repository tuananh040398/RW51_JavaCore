package com.vti.backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vti.entity.Employee;
import com.vti.utils.JDBCUtils;

public class EmployeeRepository implements IEmployeeRepository {
	@Override
	public void initData() throws ClassNotFoundException, SQLException {
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection conn = jdbcUtils.getConnection();
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee(3, "Hoang Trung Thong", "trungthong@vti.com", "123456", "java"));
		employees.add(new Employee(4, "Nguyen Huy Tien", "huytien@vti.com", "123456", "dotnet"));

		for (Employee employee : employees) {
			// Add user
			String query = "INSERT INTO `User`(Id, Fullname, Email, `Password`) VALUES (?, ?, ?, ?)";
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setInt(1, employee.getId());
			statement.setString(2, employee.getFullName());
			statement.setString(3, employee.getEmail());
			statement.setString(4, employee.getPassword());
			statement.executeUpdate();
			
			// Add employee tuong ung
			String queryEmployee = "INSERT INTO `Employee`(userid, ProSkill) VALUES (?, ?)";
			PreparedStatement statementEmployee = conn.prepareStatement(queryEmployee);
			statementEmployee.setInt(1, employee.getId());
			statementEmployee.setString(2, employee.getProSkill());
			statementEmployee.executeUpdate();
		}
		
		jdbcUtils.disconnect();
	}

}
