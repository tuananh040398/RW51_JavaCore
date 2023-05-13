package com.vti.entity;

import java.time.LocalDate;

public class StudentNew implements Comparable<StudentNew> {
	private int id;
	private String name;
	private LocalDate BDay;
	private double point;

	public StudentNew() {
	}

	public StudentNew(int id, String name, LocalDate BDay, double point) {
		super();
		this.id = id;
		this.name = name;
		this.BDay = BDay;
		this.point = point;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getbDay() {
		return BDay;
	}

	public void setbDay(LocalDate bDay) {
		this.BDay = bDay;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "StudentNew [id=" + id + ", name=" + name + ", BDay=" + BDay + ", point=" + point + "]";
	}

	public String getLastName() {
		int i = this.name.lastIndexOf(" ");
		String lastNameString = this.name.substring(i);
		return lastNameString;
	}

	@Override
	public int compareTo(StudentNew s) {
		if (this.getLastName().compareTo(s.getLastName()) == 0) {
			if (this.BDay.compareTo(s.BDay) == 0) {
				return (int) (s.point - this.point);
			} else {
				return this.BDay.compareTo(s.BDay);
			}
		} else {
			return this.getLastName().compareTo(s.getLastName());
		}
	}
}
