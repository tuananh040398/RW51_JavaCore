package com.vti.entity;

public class StudentNew extends Person {

	int Id;

	public StudentNew(String name, int id) {
		super(name);
		Id = id;
	}

	@Override
	public String toString() {
		return "StudentNew [Id=" + Id + "]";
	}

}
