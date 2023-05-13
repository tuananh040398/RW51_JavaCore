package com.vti.entity;

public class Student {
	private int Id;
	private String name;
	private String hometown;
	private double score;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public double getScore() {
		return score;
	}

	public Student(String name, String hometown) {
		super();
		this.name = name;
		this.hometown = hometown;
		this.score = (float) 0;
	}

	public Student(double d) {
		// TODO Auto-generated constructor stub
	}

	public void setScore(double score) {
		this.score = score;
	}

	public void plusScore(double plScore) {
		this.score = plScore + score;
	}

	@Override
	public String toString() {

		String XL;
		if (this.score < 4.0) {
			XL = "Yeu";
		} else if (this.score > 4.0 && this.score < 6.0) {
			XL = "Trung Binh";
		} else if (this.score > 6.0 && this.score < 8.0) {
			XL = "Kha";
		} else {
			XL = "Gioi";
		}
		return "Studen Id: " + Id + "-" + "Name: " + name + "-" + "hometown: " + hometown + "-" + "Score: " + score + XL
				+ "\n";
	}

}
