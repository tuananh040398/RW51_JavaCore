package com.vti.entity;

public class Date {

	private int day;
	private int mounth;
	private int year;

	public Date(int day, int mounth, int year) {
		this.day = day;
		this.mounth = mounth;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMounth() {
		return mounth;
	}

	public void setMounth(int mounth) {
		this.mounth = mounth;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isLeapyear() {
		this.year = year;
		boolean LY = false;
		if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", mounth=" + mounth + ", year=" + year + "]";
	}

}
