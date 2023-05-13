package com.vti.entity;

import java.time.LocalDateTime;

public class Account {
	private int accountId;
	private String email;
	public String userName;
	private String fullName;
	private Department department;
	private Position position;
	private LocalDateTime createDate;

	public Account() {
	}

	public Account(int accountId, String email, String userName, String firstName, String lastName) {
		super();
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + " " + lastName;
	}

	public Account(int accountId, String email, String userName, String firstName, String lastName, Position position) {
		super();
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + " " + lastName;
		this.position = position;
		this.createDate = LocalDateTime.now();
	}

	public Account(int accountId, String email, String userName, String firstName, String lastName, Position position,
			LocalDateTime createDate) {
		super();
		this.accountId = accountId;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + " " + lastName;
		this.position = position;
		this.createDate = createDate;
	}

	
	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

}
