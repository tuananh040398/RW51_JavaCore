package com.vti.entity;

public class Employee extends User {

	private String ProSkill;

	public Employee(int id, String fullName, String email, String password) {
		super(id, fullName, email, password);

	}

	public Employee(int id, String fullName, String email, String password, String proSkill) {
		super(id, fullName, email, password);
		ProSkill = proSkill;
	}

	public Employee(String fullName, String email, String password, String proSkill) {
		super(fullName, email, password);
		ProSkill = proSkill;
	}

	public String getProSkill() {
		return ProSkill;
	}

	public void setProSkill(String proSkill) {
		ProSkill = proSkill;
	}

	@Override
	public String toString() {
		return "Employee [ProSkill=" + ProSkill + "]";
	}

}
