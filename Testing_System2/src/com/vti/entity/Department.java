package com.vti.entity;

public class Department {
	int departmentId;
	String departmentName;
	
	@Override
	public String toString() {
		String thongtin = departmentId + " - " + departmentName;
		return thongtin;
	}
}
