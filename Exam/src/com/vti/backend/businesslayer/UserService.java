package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.ArrayList;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.User;

public class UserService implements IUserService {
	private IUserRepository userRepository;
	
	public UserService() {
		userRepository = new UserRepository();
	}

	@Override
	public ArrayList<User> getAllUsers() throws ClassNotFoundException, SQLException {
		return userRepository.getAllUsers();
	}

	@Override
	public User getUserById(int id) throws ClassNotFoundException, SQLException {
		return userRepository.getUserById(id);
	}

	@Override
	public int deleteUserById(int id) throws ClassNotFoundException, SQLException {
		return userRepository.deleteUserById(id);
	}

}
