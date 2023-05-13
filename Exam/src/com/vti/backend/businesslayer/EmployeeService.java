package com.vti.backend.businesslayer;

import java.sql.SQLException;

import com.vti.backend.datalayer.EmployeeRepository;
import com.vti.backend.datalayer.IEmployeeRepository;

public class EmployeeService implements IEmployeeService{
	private IEmployeeRepository employeeRepository;

	public EmployeeService() {
		employeeRepository = new EmployeeRepository();
	}

	@Override
	public void initData() throws ClassNotFoundException, SQLException {
		employeeRepository.initData();
	}

}
