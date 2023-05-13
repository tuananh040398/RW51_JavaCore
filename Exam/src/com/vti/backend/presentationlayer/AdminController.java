package com.vti.backend.presentationlayer;

import java.sql.SQLException;

import com.vti.backend.businesslayer.AdminService;
import com.vti.backend.businesslayer.IAdminService;

public class AdminController {
	private IAdminService adminService;

	public AdminController() {
		adminService = new AdminService();
	}
	
	public void initData() throws ClassNotFoundException, SQLException {
		adminService.initData();
	}
	
}
