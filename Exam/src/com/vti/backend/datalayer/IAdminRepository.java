package com.vti.backend.datalayer;

import java.sql.SQLException;

public interface IAdminRepository {
	public void initData() throws ClassNotFoundException, SQLException;
}
