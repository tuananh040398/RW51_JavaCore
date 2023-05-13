package com.vti.entity;

public class Nhanvien extends Canbo {
	String congviec;

	public Nhanvien(String name, byte age, Gender gender, String address, String congviec) {
		super(name, age, gender, address);
		this.congviec = congviec;
	}

	@Override
	public String toString() {
		return super.toString() + "Nhanvien [congviec=" + congviec + "]";
	}

}
