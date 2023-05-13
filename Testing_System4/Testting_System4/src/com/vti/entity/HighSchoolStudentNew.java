package com.vti.entity;

public class HighSchoolStudentNew extends StudentNew {

	String clazz;
	String desiredUniversity;

	public HighSchoolStudentNew(String name, int id, String clazz, String desiredUniversity) {
		super(name, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;

	}

	@Override
	public String toString() {
		return "HighSchoolStudentNew [ Id = " + Id + ", " + "Name = " + name + ", " + "clazz=" + clazz
				+ ", desiredUniversity=" + desiredUniversity + "]";
	}
}
