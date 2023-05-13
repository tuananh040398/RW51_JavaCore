package com.vti.backend.datalayer;

import java.sql.SQLException;

public interface IEmployeeRepository {

		public void initData() throws ClassNotFoundException, SQLException;
}
