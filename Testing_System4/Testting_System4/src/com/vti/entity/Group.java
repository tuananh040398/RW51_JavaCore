package com.vti.entity;

import java.time.LocalDateTime;

public class Group {
	private int groupId;
	private String groupName;
	private Account creator;
	public Account[] accounts;
	private LocalDateTime createDate;

	public Group() {
	}

	public Group(String groupName, Account creator, LocalDateTime createDate) {
		super();
		this.groupName = groupName;
		this.creator = creator;
//		this.accounts = accounts;
		this.createDate = createDate;
	}

	public Group(String groupName, Account creator, String[] userNames, LocalDateTime createDate) {
		super();
		this.groupName = groupName;
		this.creator = creator;
		this.createDate = createDate;

		this.accounts = new Account[userNames.length];
		for (int i = 0; i < this.accounts.length; i++) {
			this.accounts[i] = new Account();
			this.accounts[i].userName = userNames[i];
		}

	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

}
