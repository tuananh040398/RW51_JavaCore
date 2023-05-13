package com.vti.frontend;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.vti.backend.presentationlayer.AdminController;
import com.vti.backend.presentationlayer.EmployeeController;
import com.vti.backend.presentationlayer.UserController;
import com.vti.entity.User;
import com.vti.utils.ScannerUtils;

public class Program {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		while (true) {
			ShowMenu();
			int n = Integer.parseInt(sc.nextLine());
			switch (n) {
			case 0:
				System.out.println("Chuong trinh ket thuc.");
				return;
			case 1:
				initData();
				break;
			case 2:
				showAllUsers();
				break;
			case 3:
				getUserById();
				break;
			case 4:
				deleteUserById();
				break;
			default:
				System.out.println("Chuc nang khong hop le.");
				break;
			}

			System.out.println("\nPress Enter to continue...");
			sc.nextLine();
		}
	}

	private static void deleteUserById() throws ClassNotFoundException, SQLException {
		System.out.print("Nhap user id: ");
		int id = ScannerUtils.inputInt(sc, "Nhap sai dinh dang");
		UserController userController = new UserController();
		int affectedRows = userController.deleteUserById(id);
		if (affectedRows > 0) {
			System.out.println("Xoa thanh cong");
		} else {
			System.out.println("Khong tim thay user");
		}
	}

	private static void getUserById() throws ClassNotFoundException, SQLException {
		System.out.print("Nhap user id: ");
		int id = ScannerUtils.inputInt(sc, "Nhap sai dinh dang");
		UserController userController = new UserController();
		User user = userController.getUserById(id);
		if (user != null) {
			System.out.println(user.toString());
		} else {
			System.out.println("Khong tim thay user");
		}
	}

	private static void showAllUsers() throws ClassNotFoundException, SQLException {
		UserController userController = new UserController();
		ArrayList<User> users = userController.getAllUsers();
		for (User user : users) {
			System.out.println(user.toString());
		}
	}

	private static void initData() throws ClassNotFoundException, SQLException {
		AdminController adminController = new AdminController();
		adminController.initData();
		EmployeeController employeeController = new EmployeeController();
		employeeController.initData();
	}

	public static void ShowMenu() {
		System.out.println("1. Khoi tao thong tin User");
		System.out.println("2. In danh sach User");
		System.out.println("3. In thong tin User theo Id");
		System.out.println("4. Xoa thong tin User theo Id");
		System.out.println("5. Login");
		System.out.println("6. Tao them User");
		System.out.println("0. Thoat chuong trinh");
		System.out.print("-----------------Nhap chuc nang-----------------");
	}

}
