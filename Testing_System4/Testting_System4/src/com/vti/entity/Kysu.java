package com.vti.entity;

public class Kysu extends Canbo {
	String nganhDT;

	public Kysu(String name, byte age, Gender gender, String address, String nganhDT) {
		super(name, age, gender, address);
		this.nganhDT = nganhDT;
	}

	@Override
	public String toString() {
		return super.toString() + "Kysu [nganhDT=" + nganhDT + "]";
	}

}
