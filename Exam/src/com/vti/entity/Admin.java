package com.vti.entity;

public class Admin extends User {

	private int ExpInYear;

	public Admin(int id, String fullName, String email, String password) {
		super(id, fullName, email, password);
	}

	public Admin(int id, String fullName, String email, String password, int expInYear) {
		super(id, fullName, email, password);
		ExpInYear = expInYear;
	}

	public Admin(String fullName, String email, String password, int expInYear) {
		super(fullName, email, password);
		ExpInYear = expInYear;
	}

	public int getExpInYear() {
		return ExpInYear;
	}

	public void setExpInYear(int expInYear) {
		ExpInYear = expInYear;
	}

	@Override
	public String toString() {
		return "Admin [ExpInYear=" + ExpInYear + "]";
	}

}
