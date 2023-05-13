package com.vti.entity;

import java.time.LocalDateTime;

public class Exercise1 {

	public static void main(String[] args) {

// Department

		Department phongban1 = new Department();
		phongban1.departmentId = 1;
		phongban1.departmentName = "HCNS";

		Department phongban2 = new Department();
		phongban2.departmentId = 2;
		phongban2.departmentName = "sale";

		Department phongban3 = new Department();
		phongban3.departmentId = 3;
		phongban3.departmentName = "Marketing";

		Department[] phongbans = { phongban1, phongban2, phongban3 };

// Position

		Position chucvu1 = new Position();
		chucvu1.positionId = 1;
		chucvu1.positionName = "Dev";

		Position chucvu2 = new Position();
		chucvu2.positionId = 2;
		chucvu2.positionName = "Test";

		Position chucvu3 = new Position();
		chucvu3.positionId = 3;
		chucvu3.positionName = "Scrum_Master";

		Position chucvu4 = new Position();
		chucvu4.positionId = 4;
		chucvu4.positionName = "PM";

// Group

		Group group1 = new Group();
		group1.groupId = 1;
		group1.groupName = "RW1";
		group1.createDate = LocalDateTime.now();

		Group group2 = new Group();
		group2.groupId = 2;
		group2.groupName = "RW2";
		group2.createDate = LocalDateTime.now();

		Group group3 = new Group();
		group3.groupId = 3;
		group3.groupName = "RW3";
		group3.createDate = LocalDateTime.now();

// Account

		Account account1 = new Account();
		account1.accountId = 1;
		account1.email = "nguyentuananh01@gmail.com";
		account1.userName = "tuananh";
		account1.fullName = "nguyentuananh";
		account1.department = phongban1;
		account1.position = chucvu1;
		account1.createDate = LocalDateTime.now();
		Group[] groups1 = { group1, group2, group3 };
		account1.groups = groups1;

		Account account2 = new Account();
		account2.accountId = 2;
		account2.email = "nguyentuanem02@gmail.com";
		account2.userName = "tuanem";
		account2.fullName = "nguyentuanem";
		account2.department = phongban2;
		account2.position = chucvu2;
		account2.createDate = LocalDateTime.now();
		Group[] groups2 = { group2 };
		account2.groups = groups2;

		Account account3 = new Account();
		account3.accountId = 3;
		account3.email = "nguyentuanchi@gmail.com";
		account3.userName = "tuanchi";
		account3.fullName = "nguyentuanchi";
		account3.department = phongban3;
		account3.position = chucvu3;
		account3.createDate = LocalDateTime.now();
		Group[] groups3 = { group2, group3 };
		account3.groups = groups3;

		Account[] accounts1 = { account1 };
		group1.accounts = accounts1;

//		Account[] accounts2 = {account1, account2, account3};
//		group2.accounts = accounts2;
//		
//		Account[] accounts3 = {account3};
//		group3.accounts = accounts3;

		Account[] accounts = { account1, account2, account3 };

		Question_1(account2);
		Question_4(account1);
		Question_5(group1); // switch case
		Question_6(account2); // switch case
		Question_7(account1); // switch case
		Question_8(accounts); // foreach
		Question_9(phongbans); // foreach
		Question_10(accounts); // for
		Question_11(phongbans);
		Question_12(phongbans);
		Question_13(accounts);
		Question_14(accounts);
		Question_15();
		Question_16(accounts, phongbans);
		Question_17(accounts, phongbans); // do while
	}

	public static void Question_17(Account[] accounts, Department[] phongbans) {
// Question 17: Làm lại các Question ở phần FOR bằng cách sử dụng 
//				DO-WHILE kết hợp với lệnh break, continue

// In ra thông tin các account

		int i = 0;
		do {
			System.out.println("Thong tin account thu " + (i + 1) + " la:");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("FullName: " + accounts[i].fullName);
			System.out.println("Phong ban: " + accounts[i].department.departmentName);
			i++;
		} while (i < accounts.length);

// In ra thông tin các phòng ban

		int i2 = 0;
		do {
			System.out.println("Thong tin phong ban thu " + (i + 1) + " la:");
			System.out.println("Id: " + phongbans[i2].departmentId);
			System.out.println("Phong: " + phongbans[i2].departmentName);
			i2++;
		} while (i2 < phongbans.length);

// Chỉ in ra thông tin 2 department đầu tiên

		int i3 = 0;
		do {
			System.out.println("Thong tin phong ban thu " + (i + 1) + " la:");
			System.out.println("Id: " + phongbans[i3].departmentId);
			System.out.println("Phong ban: " + phongbans[i3].departmentName);
			i3++;
		} while (i3 < 2);

// in ra thông tin tất cả các account ngoại trừ account thứ 2

		int i4 = 0;
		do {
			System.out.println("Thong tin account thu " + (i4 + 1) + " la:");
			System.out.println("Email: " + accounts[i4].email);
			System.out.println("FullName: " + accounts[i4].fullName);
			System.out.println("Phong ban: " + accounts[i4].department.departmentName);
			i4++;
		} while (i4 != 2);
		
//		In ra thông tin tất cả các account có id < 4
		
		int i5 = 0;
		do { 
			if (accounts[i5].accountId < 4 ) {
			System.out.println("Thong tin account thu: " + (i5 + 1) + " la:");
			System.out.println("Email: " + accounts[i4].email);
			System.out.println("FullName: " + accounts[i4].fullName);
			System.out.println("Phong ban: " + accounts[i4].department.departmentName);
			}
			i5++;
		} while (i5 < accounts.length);
		
	}

	public static void Question_16(Account[] accounts, Department[] phongbans) {

//		Question 16: Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
//		lệnh break, continue

//	In ra thông tin các account bao gồm: Email,
//		FullName và tên phòng ban của họ theo định dạng

		int i1 = 0;
		while (i1 < accounts.length) {
			System.out.println("Thong tin account thu " + (i1 + 1) + " la: ");
			System.out.println("Email: " + accounts[i1].email);
			System.out.println("FullName: " + accounts[i1].fullName);
			System.out.println("Phong ban: " + accounts[i1].department.departmentName);
			i1++;
		}

// In ra thông tin các phòng ban bao gồm: id và name
//		theo định dạng	

		int i2 = 0;
		while (i2 < phongbans.length) {
			System.out.print("Thong tin phong ban thu " + (i2 + 1) + " la: ");
			System.out.printf("Id: %d - ", phongbans[i2].departmentId);
			System.out.printf("Phong ban: %s\n", phongbans[i2].departmentName);
			i2++;
		}

// Chỉ in ra thông tin 2 department đầu tiên

		int i3 = 0;
		while (i3 < phongbans.length) {
			if (i3 < 2) {
				System.out.print("Thong tin phong ban thu " + (i3 + 1) + " la: ");
				System.out.printf("Id: %d - ", phongbans[i3].departmentId);
				System.out.printf("Phong ban: %s\n", phongbans[i3].departmentName);
			}
			i3++;
		}

// in ra thông tin tất cả các account ngoại trừ
//		account thứ 2

		int i4 = 0;
		while (i4 < accounts.length) {
			if (i4 != 1) {
				System.out.println("Thong tin account thu " + (i4 + 1) + " la: ");
				System.out.printf("Email: %s\n", accounts[i4].email);
				System.out.printf("FullName: %s\n", accounts[i4].fullName);
				System.out.printf("Phong ban: %s\n", accounts[i4].department.departmentName);
			}
			i4++;
		}

// In ra thông tin tất cả các account có id < 4

		int i5 = 0;
		while (i5 < accounts.length) {
			if (accounts[i5].accountId <4)
			System.out.println("Thong tin account thu " + (i5 + 1) + " la: ");
			System.out.printf("Email: %s\n", accounts[i5].email);
			System.out.printf("Fullname: %s\n", accounts[i5].fullName);
			System.out.printf("Phong ban: %s/n", accounts[i5].department.departmentName);
			i5++;
		}

	}

	public static void Question_15() {

//		Question 15: In ra các số chẵn nhỏ hơn hoặc bằng 20

		System.out.print("Cac so chan nho hon hoac bang 20 la: ");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println(" ");
	}

	public static void Question_14(Account[] accounts) {

//		Question 14: In ra thông tin tất cả các account có id < 4

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].accountId < 4) {
				System.out.print("Thong tin account thu " + (i + 1) + " la: ");
				System.out.printf("Email: %s - ", accounts[i].accountId);
				System.out.printf("FullName: %s - ", accounts[i].fullName);
				System.out.printf("Phong ban: %s\n", accounts[i].department.departmentName);
			}

		}

	}

	public static void Question_13(Account[] accounts) {

//		Question 13: In ra thông tin tất cả các account ngoại trừ account thứ 2

		for (int i = 0; i < accounts.length; i++) {
			if (i != 1) {
				System.out.print("Thong tin account thu " + (i + 1) + " la: ");
				System.out.printf("Email: %s - ", accounts[i].email);
				System.out.printf("FullName: %s - ", accounts[i].fullName);
				System.out.printf("Phong ban: %s\n", accounts[i].department.departmentName);
			}

		}

	}

	public static void Question_12(Department[] phongbans) {

//		Question 12: Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10

		for (int i = 0; i < 2; i++) {
			System.out.print("Thong tin phong ban thu " + (i + 1) + " la: ");
			System.out.printf("Id: %d", phongbans[i].departmentId);
			System.out.printf(" - Phong: %s\n", phongbans[i].departmentName);

		}

	}

	public static void Question_11(Department[] phongbans) {

//		Question 11: In ra thông tin các phòng ban bao gồm: id và name theo định dạng

		for (int i = 0; i < phongbans.length; i++) {
			System.out.print("Thong tin Department thu " + (i + 1) + " la: ");
			System.out.printf("Id: %d - ", phongbans[i].departmentId);
			System.out.printf("Name: %s\n", phongbans[i].departmentName);
		}

	}

	public static void Question_10(Account[] accounts) {

//		Question 10: In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//		họ theo định dạng

		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Thong tin account thu " + (i + 1) + " la: ");
			System.out.printf("Email: %s - ", accounts[i].email);
			System.out.printf("FullName: %s - ", accounts[i].fullName);
			System.out.printf("Phongban: %s\n", accounts[i].department.departmentName);
		}
	}

	public static void Question_9(Department[] phongbans) {

//		Question 9: In ra thông tin các phòng ban bao gồm: id và name

		for (Department department : phongbans) {
			System.out.printf("%d - %s\n", department.departmentId, department.departmentName);
		}
	}

	public static void Question_8(Account[] accounts) {

// Question 8: In ra thông tin các account bao gồm: Email, FullName 
//		và tên phòng ban của họ

		for (Account account : accounts) {
			System.out.printf("%s - %s - %s\n", account.email, account.fullName, account.department.departmentName);
		}
	}

	public static void Question_7(Account account1) {

// Question 7: Sử dụng switch case để làm lại Question 4

		switch (account1.position.positionName) {
		case "Dev":
			System.out.println("Day la Developer");
			break;
		default:
			System.out.println("Nguoi nay khong phai la Developer");

		}

	}

	public static void Question_6(Account account2) {

//		Question 6: Sử dụng switch case để làm lại Question 2

		if (account2.groups == null) {
			System.out.println("Nhan vien nay chua co group");
		} else {
			int a = account2.groups.length;
			switch (a) {
			case 1:
				System.out.println("Group của nhân viên này là  Java Fresher, C# Fresher");
				break;
			case 2:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 3:
				System.out.println("Nhan vien nay la nguoi quan trong, tham gia nhieu group");
				break;
			default:
				System.out.println("Nhan vien nay la nguoi hong chuyen, tham gia tat ca cac group");
			}
		}
	}

	public static void Question_5(Group group1) {

// Question 5: Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//		Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//		Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//		Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//		Còn lại in ra "Nhóm có nhiều thành viên"

		if (group1.accounts == null) {
			System.out.println("Nhom 1 chua co thanh vien nao");
		} else {
			int a = group1.accounts.length;
			switch (a) {
			case 1:
				System.out.println("Nhom co mot thanh vien");
				break;
			case 2:
				System.out.println("Nhom co hai thanh vien");
				break;
			case 3:
				System.out.println("Nhom co ba thanh vien");
				break;
			default:
				System.out.println("Nhom co nhieu thanh vien");
			}
		}

	}

	public static void Question_4(Account account1) {

// Question 4: Sử dụng toán tử ternary để làm yêu cầu sau:
//		Kiểm tra Position của account thứ 1
//		Nếu Position = Dev thì in ra text "Đây là Developer"
//		Nếu không phải thì in ra text "Người này không phải là Developer"	

		System.out.println(
				account1.position.positionName == "Dev" ? "Đây là Developer" : "Người này không phải là Developer");

	}

	public static void Question_1(Account account2) {

		// Question 1: Kiểm tra account thứ 2
//			Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
//			"Nhân viên này chưa có phòng ban"
//			Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."

		if (account2.department == null) {
			System.out.println("nhân viên này chưa có phòng ban");
		} else {
			System.out.printf("phòng ban của nhân viên này là : %s \n", account2.department.departmentName);
		}

		// Question 2: Kiểm tra account thứ 2
//			Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//			Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//			này là Java Fresher, C# Fresher"
//			Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//			quan trọng, tham gia nhiều group"
//			Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//			người hóng chuyện, tham gia tất cả các group"

		if (account2.groups.length == 0) {
			System.out.println("nhân viên này chưa có group");
		} else if (account2.groups.length == 1 || account2.groups.length == 2) {
			System.out.println("group của nhân viên này là   Java Fresher,C# Fresgher");
		} else if (account2.groups.length == 3) {
			System.out.println("nhân viên này là người quan trọng, tham gia nhiều group");
		} else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}

		// Question3 Sử dụng toán tử ternary để làm Question 1

		System.out.printf(account2.department == null ? "nhân viên này chưa có phòng ban"
				: "phòng ban của nhân viên này là : %s \n", account2.department.departmentName);
	}

}
