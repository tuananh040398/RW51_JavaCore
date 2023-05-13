package com.vti.entity;

public class Student {
	private int id;
	private String nameString;
	private static String colleString = "Dai hoc Bach Khoa";
	private static int moneyGroup;

	public void Student() {

	}

	public Student(int id, String nameString) {
		this.id = id;
		this.nameString = nameString;
	}

	public static String getColleString() {
		return colleString;
	}

	public static void setColleString(String colleString) {
		Student.colleString = colleString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public void takemoney(int amount, String reason) {
		System.out.printf("%s lay ra %s de %s\n", this.nameString, amount, reason);
		moneyGroup = moneyGroup - amount;
	}

	public void givemoney(int amount) {
		System.out.printf("%s dong vao quy %s\n", this.nameString, amount);
		moneyGroup = moneyGroup + amount;
	}

	public static int getMoneyGroup() {
		return moneyGroup;
	}

	public static void showmoneyGroup() {
		System.out.println("Tien quy " + moneyGroup);
	}

	public void name() {

	}

	@Override
	public String toString() {
		return "Id: " + this.id + "- " + this.nameString + " - " + colleString;
	}
}
