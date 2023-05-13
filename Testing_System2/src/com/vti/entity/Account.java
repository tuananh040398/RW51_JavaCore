package com.vti.entity;

import java.time.LocalDateTime;

public class Account {
	int accountId;
	String email;
	String userName;
	String fullName;
	Department department;
	Position position;
	LocalDateTime createDate;
	Group[] groups;


	@Override
	public String toString() {
		String thongtin = accountId + " - " + email + " - " + fullName + " - " + userName + "- " + "department";
		return thongtin;
	}
}
