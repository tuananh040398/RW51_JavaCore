package com.vti.backend.businesslayer;

import java.sql.SQLException;

import com.vti.backend.datalayer.AdminRepository;
import com.vti.backend.datalayer.IAdminRepository;

public class AdminService implements IAdminService {

	private IAdminRepository adminRepository;
	
	public AdminService() {
		adminRepository = new AdminRepository();
	}

	@Override
	public void initData() throws ClassNotFoundException, SQLException {
		adminRepository.initData();
	}

}
