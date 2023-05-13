package com.vti.backend.presentationlayer;

import java.sql.SQLException;

import com.vti.backend.businesslayer.EmployeeService;
import com.vti.backend.businesslayer.IEmployeeService;

public class EmployeeController {
	private IEmployeeService employeeService;

	public EmployeeController() {
		employeeService = new EmployeeService();
	}
	
	public void initData() throws ClassNotFoundException, SQLException {
		employeeService.initData();
	}
	
}
