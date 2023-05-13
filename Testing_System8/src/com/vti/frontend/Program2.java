package com.vti.frontend;

import com.vti.backend.*;
import com.vti.entity.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import com.vti.backend.Exercise_2;
import com.vti.entity.Student;

import com.vti.entity.StudentNew;

public class Program2 {

	public static void main(String[] args) {

		ArrayList<StudentNew> stdArrayList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			ShowMenu();
			int n = Integer.parseInt(scanner.nextLine());
			switch (n) {

			case 1:
				stdArrayList = Exercise_2.ReadStudentList();
				break;
			case 2:
				Exercise_2.SortStudentList(stdArrayList);
				break;
			case 3:
				Exercise_2.PrintStudentById(stdArrayList);
				break;
			case 4:
				Exercise_2.RemoveStudentByID(stdArrayList);
				break;
			case 5:
				Exercise_2.AddStudent(stdArrayList);
				break;
			case 6:
				System.out.println("Chuong trinh ket thuc.");
				return;
			default:
				System.out.println("Chuc nang khong hop le.");
				break;
			}
			
			System.out.println("\n Press Enter to continue...");
			scanner.nextLine();
		}
	}
	
	public static void ShowMenu() {
		System.out.println("===============MENU===============");
		System.out.println("1. Khoi tao thong tin Student");
		System.out.println("2. In danh sach Student (da duoc sap xep)");
		System.out.println("3. In thong tin Student theo ID");
		System.out.println("4. Xoa Student theo ID");
		System.out.println("5. Them Student");
		System.out.println("6. Thoat chuong trinh");
		System.out.print("Nhap chuc nang: ");
	}
}
