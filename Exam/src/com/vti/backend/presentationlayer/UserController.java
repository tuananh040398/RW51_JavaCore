package com.vti.backend.presentationlayer;

import java.sql.SQLException;
import java.util.ArrayList;

import com.vti.backend.businesslayer.IUserService;
import com.vti.backend.businesslayer.UserService;
import com.vti.entity.User;

public class UserController {
	private IUserService userService;

	public UserController() {
		userService = new UserService();
	}

	public ArrayList<User> getAllUsers() throws ClassNotFoundException, SQLException {
		return userService.getAllUsers();
	}

	public User getUserById(int id) throws ClassNotFoundException, SQLException {
		return userService.getUserById(id);
	}

	public int deleteUserById(int id) throws ClassNotFoundException, SQLException {
		return userService.deleteUserById(id);
	}
}
