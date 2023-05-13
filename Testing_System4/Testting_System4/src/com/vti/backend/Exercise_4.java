package com.vti.backend;

import com.vti.entity.Date;
import com.vti.entity.Student;

public class Exercise_4 {

	public void Question_2() {
		Date date1 = new Date(04, 03, 2000);

		System.out.println("kiem tra nam nhuan");

		if (date1.isLeapyear()) {
			System.out.println("Day la nam nhuan");
		} else {
			System.out.println("Day khong phai nam nhuan");
		}

	}

	public void Question_1() {
		Student std1 = new Student("name1", "hometown1");
		Student std2 = new Student("name2", "hometown2");
		Student std3 = new Student("name3", "hometown3");

		std1.setScore(3f);
		std2.setScore(5f);
		std3.setScore(7f);

		std1.plusScore(1f);
		std2.plusScore(2f);
		std3.plusScore(1f);

		System.out.println(std1);
		System.out.println(std2);
		System.out.println(std3);
	}

}
