package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.ArrayList;

import com.vti.entity.User;

public interface IUserService {
	public ArrayList<User> getAllUsers() throws ClassNotFoundException, SQLException;

	public User getUserById(int id) throws ClassNotFoundException, SQLException;

	public int deleteUserById(int id) throws ClassNotFoundException, SQLException;
}
