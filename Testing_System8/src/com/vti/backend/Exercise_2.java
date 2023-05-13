package com.vti.backend;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

import com.vti.entity.StudentNew;
import com.vti.entity.*;
import java.util.Comparator;

public class Exercise_2 {
	public static ArrayList<StudentNew> ReadStudentList() {
		ArrayList<StudentNew> stdArrayList = new ArrayList<>();

		stdArrayList.add(new StudentNew(1, "Nguyen Tuan Anh", LocalDate.parse("1998-03-04"), 6.0));
		stdArrayList.add(new StudentNew(2, "Dang Ngoc Chien", LocalDate.parse("1998-01-01"), 5.0));
		stdArrayList.add(new StudentNew(3, "Nguyen Huy Tien", LocalDate.parse("1995-01-01"), 4.0));
		stdArrayList.add(new StudentNew(4, "Uong Cong Thang", LocalDate.parse("1994-01-01"), 9.0));
		stdArrayList.add(new StudentNew(5, "Doan Manh Dat", LocalDate.parse("2002-01-01"), 7.0));

		System.out.println("Da load duoc" + stdArrayList.size() + " ");
		return stdArrayList;
	}

	public static void SortStudentList(ArrayList<StudentNew> stdArrayList) {
		Collections.sort(stdArrayList);
		System.out.println("Danh sach student: ");
		for (StudentNew studentNew : stdArrayList) {
			System.out.println(studentNew.toString());
		}
	}

	public static void PrintStudentById(ArrayList<StudentNew> stdArrayList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap Id muon hien thi: ");
		int id = Integer.parseInt(scanner.nextLine());

		if (stdArrayList.stream().anyMatch(studentNew -> studentNew.getId() == id)) {
			stdArrayList.stream().filter(studentNew -> studentNew.getId() == id)
					.forEach(student -> System.out.println(student.toString()));
		} else {
			System.out.println("Khong tim thay student");
		}
	}

	public static void RemoveStudentByID(ArrayList<StudentNew> stdArrayList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap Id muon xoa: ");
		int id = Integer.parseInt(scanner.nextLine());

		if (stdArrayList.stream().anyMatch(studentNew -> studentNew.getId() == id)) {
			stdArrayList.removeIf(studentNew -> studentNew.getId() == id);
			System.out.println("Xoa thanh cong.");
		} else {
			System.out.println("Khong tim thay student");
		}
	}

	public static void AddStudent(ArrayList<StudentNew> stdArrayList) {
		Scanner scanner = new Scanner(System.in);
		StudentNew studentNew = new StudentNew();

		int nextId = getNextId(stdArrayList);
		studentNew.setId(nextId);

		System.out.println("Nhap ten: ");
		studentNew.setName(scanner.nextLine());

		System.out.println("Nhap ngay sinh: ");
		String birthdayString = scanner.nextLine();
		LocalDate birthdayLocalDate = LocalDate.parse(birthdayString);
		studentNew.setbDay(birthdayLocalDate);

		System.out.println("Nhap diem: ");
		double diem = Double.parseDouble(scanner.nextLine());
		studentNew.setPoint(diem);

		stdArrayList.add(studentNew);
		System.out.println("Them student thanh cong.");
	}

	private static int getNextId(ArrayList<StudentNew> stdArrayList) {
		if (stdArrayList.size() == 0) {
			return 1;
		} else {
			StudentNew lastStudentNew = stdArrayList.stream().max(new Comparator<StudentNew>() {
				@Override
				public int compare(StudentNew o1, StudentNew o2) {
					return o1.getId() - o2.getId();
				}
			}).get();
			return lastStudentNew.getId() + 1;
		}
	}
}
