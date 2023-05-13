package com.vti.backend;

import java.util.Scanner;

import javax.annotation.processing.AbstractProcessor;
import javax.lang.model.element.NestingKind;

import com.vti.entity.VietnamesePhone;

public class Exercise_6 {

	Scanner sc = new Scanner(System.in);

	public void Question_1() {
		VietnamesePhone VNP = new VietnamesePhone();

		while (true) {
			System.out.println("Moi ban nhap chuc nang: ");
			System.out.println("1. Them contact");
			System.out.println("2. Xoa contact");
			System.out.println("3. Cap nhat contact");
			System.err.println("4. Tim kiem contact");
			System.out.println("5. Hien thi contact");
			System.out.println("6. Thoat khoi chuong trinh");
			
			int chucnang = sc.nextInt();
			sc.nextLine();
			
			switch (chucnang) {
			case 1:
				System.out.println("Nhap ten: ");
				String ten = sc.nextLine();
				System.out.println("Nhap SDT");
				String sdtString = sc.nextLine();
				VNP.insertContact(ten, sdtString);
				break;
			case 2:
				System.out.println("Nhap ten can xoa:");
				String delString = sc.nextLine();
				VNP.removeContact(delString);
			case 3:
				System.out.println("Nhap ten can cap nhat:");
				String udnameString = sc.nextLine();
				System.out.println("Nhap sdt moi:");
				String udphoneString = sc.nextLine();
				VNP.updateContact(udnameString, udphoneString);
			case 4:
				System.out.println("Nhap ten can tim:");
				String findnameString = sc.nextLine();
				VNP.searchContact(findnameString);
			case 5:
				System.out.println("Hien thi contact:");
				VNP.printContact();
			default:
				break;
			}
		}

	}
}
