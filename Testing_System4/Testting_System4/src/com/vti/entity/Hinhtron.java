package com.vti.entity;

public class Hinhtron {
	private double bankinh = 1.0f;
	private String mausac = "red";

	public Hinhtron() {
	}

	public Hinhtron(double bankinh, String mausac) {
		super();
		this.bankinh = bankinh;
		this.mausac = mausac;
	}

	public void setRadius(double radius) {
		this.bankinh = bankinh;
	}

	public Hinhtron(double bankinh) {
	}

	public double getBanKinh() {
		return bankinh;
	}

	public String getMausac() {
		return mausac;
	}

	public void setMausac(String mausac) {
		this.mausac = mausac;
	}

	public double getDienTich() {
		return (this.bankinh * this.bankinh) * Math.PI;
	}

	@Override
	public String toString() {
		return "Hinh trong co ban kinh = " + this.bankinh;
	}

}
