package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.ArrayList;

import com.vti.entity.User;

public interface IUserRepository {
	public ArrayList<User> getAllUsers() throws ClassNotFoundException, SQLException;

	public User getUserById(int id) throws ClassNotFoundException, SQLException;

	public int deleteUserById(int id) throws ClassNotFoundException, SQLException;
}
