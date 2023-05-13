package com.vti.backend;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.print.event.PrintJobAttributeListener;

import com.vti.entity.Student;

public class Exercise_1 {
	public static void Question_1() {
//		ArrayList<Student> studentList = new ArrayList<Student>();

//		List<Student> studentList = Arrays.asList(st1, st2, st3, st4, st5, st6);

		ArrayList<Student> studentList = new ArrayList<Student>();

		studentList.add(new Student(1, "Nguyen Tuan Anh"));
		studentList.add(new Student(2, "Doan Manh Dat"));
		studentList.add(new Student(3, "Nguyen Huy Tien"));
		studentList.add(new Student(4, "Nguyen Tuan Hung"));
		studentList.add(new Student(5, "Hoang Trung Thong"));
		studentList.add(new Student(6, "Le Hoang Nhat"));

		// a
		System.out.println("Mang co " + studentList.size() + " phan tu");

		// b
		System.out.println("Student thu 4 la: " + studentList.get(3).toString());

		// c
		System.out.println("Student dau tien la: " + studentList.get(0).toString());
		System.out.println("Student cuoi cung la: " + studentList.get(studentList.size() - 1));

		// d
		PrintList(studentList);
		Student st7 = new Student(7, "Nguyen Manh Hieu");
		studentList.add(0, st7);

		// e
		Student st8 = new Student(8, "Dang Ngoc Chien");
		studentList.add(st8);
		PrintList(studentList);
		
		// f
		Collections.reverse(studentList);
		PrintList(studentList);
		// g
		SearchStudentById(studentList, 10);

		// h
		SearchStudentByName(studentList, "ien");

		// j
		RemoveNameById(studentList, 2);
		PrintList(studentList);
		
		//k
		DeleteStudentById(studentList, 5);
		PrintList(studentList);
		
		//l
		ArrayList<Student> studentcoppies = new ArrayList<Student>();
		studentcoppies.addAll(studentcoppies);
		PrintList(studentList);
	}

	private static void DeleteStudentById(ArrayList<Student> studentList, int id) {
		//c1
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId() == id) {
				studentList.remove(i);
			}
		}
		
		//c2
		studentList.removeIf(student -> student.getId() == id);
	}

	private static void PrintList(ArrayList<Student> studentList) {
		System.out.println("Danh sach sinh vien: ");
		for (Student student : studentList) {
			System.out.println(student.toString());
		}
	}

	private static void RemoveNameById(ArrayList<Student> studentList, int id) {
		for (Student student : studentList) {
			if (student.getId() == id) { // tim thay
				student.setName(null);
			}
		}
	}

	public static void SearchStudentByName(ArrayList<Student> students, String name) {
		// c1
		boolean isFound = false;
		for (Student student : students) {
			if (student.getName().contains(name)) {
				System.out.println(student.toString());
				isFound = true;
			}
		}
		if (isFound == false) {
			System.out.println("Khong co sinh vien nao co id = " + name);
		}

		// c1
		for (Student student : students) {
			if (student.getName() == name) {
				System.out.println(student.toString());
			}
		}

//		//c2
//		students.stream().filter(student -> student.getName() == name)
//				.forEach(student -> System.out.println(student.toString()));
	}

	public static List<Student> SearchStudentById(ArrayList<Student> students, int id) {
		List<Student> searchResultList = new ArrayList<Student>();
		// c1
		for (Student student : students) {
			if (student.getId() == id) { // tim thay
				System.out.println(student.toString());
				searchResultList.add(student);
			}
		}
		// c2
		students.stream().filter(student -> student.getId() == id).forEach(student -> searchResultList.add(student));

		// Hien thi ket qua
		if (searchResultList.size() == 0) {
			System.out.println("Khong co sinh vien nao co Id = " + id);
		} else {
			for (Student student : searchResultList) {
				System.out.println(student.toString());
			}
		}

		// Ket qua tra ve

		return searchResultList;

		// c1
//		for (Student student : students) {
//			if (student.getId() == id) {
//				System.out.println(student.toString());
//			}
//		}
//
//		// c2
//		students.stream().filter(student -> student.getId() == id)
//				.forEach(student -> System.out.println(student.toString()));
//
	}
}
