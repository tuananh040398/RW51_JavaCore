package com.vti.entity;

public class User {
	private int id;
	private String FullName;
	private String Email;
	private String Password;

	public User(int id, String fullName, String email, String password) {
		super();
		this.id = id;
		FullName = fullName;
		Email = email;
		Password = password;
	}

	public User(int id, String fullName, String email) {
		super();
		this.id = id;
		FullName = fullName;
		Email = email;
	}

	public User(String fullName, String email, String password) {
		super();
		FullName = fullName;
		Email = email;
		Password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return id + "\t" + FullName + "\t" + Email;
	}

}
