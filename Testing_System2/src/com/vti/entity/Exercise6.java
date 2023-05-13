package com.vti.entity;
import java.time.LocalDateTime;

public class Exercise6 {

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
				account1.createDate =LocalDateTime.now();
				Group[] groups1 = {group1, group2, group3};
				account1.groups = groups1;
				
				
				Account account2 = new Account();
				account2.accountId = 2;
				account2.email = "nguyentuanem02@gmail.com";
				account2.userName = "tuanem";
				account2.fullName = "nguyentuanem";
				account2.department = phongban2;
				account2.position = chucvu2;
				account2.createDate =LocalDateTime.now();
				Group[] groups2 = {group2};
				account2.groups = groups2;

				Account account3 = new Account();
				account3.accountId = 3;
				account3.email = "nguyentuanchi@gmail.com";
				account3.userName = "tuanchi";
				account3.fullName = "nguyentuanchi";
				account3.department = phongban3;
				account3.position = chucvu3;
				account3.createDate =LocalDateTime.now();
				Group[] groups3 = {group2, group3};
				account3.groups = groups3;		
		
				Account[] accounts = {account1, account2, account3};		
				
		Question_1();
		Question_2(accounts);
		Question_3();
	}
	private static void Question_3() {

// Question 3: 	Tạo method để in ra các số nguyên dương nhỏ hơn 10	
		
		System.out.println("Đây là các số nguyên dương < 10");
			for( int i = 1; i < 10; i++) {
					System.out.print(i+ " ");
			}		
	System.out.println(" ");}
	
	private static void Question_2(Account[] accounts) {	
		
// Question 2: Tạo method để in thông tin các account		
		
		int i = 0;
		for (Account acc : accounts) {
		System.out.printf("Thông tin account thứ %d:\n", i++);
		System.out.printf("Email: %s\n", acc.email);
		System.out.printf("FullName: %s\n", acc.fullName);	
		System.out.printf("Phòng ban: %s\n", acc.department.departmentName);	
	}
}	
	private static void Question_1() {

// Question 1: Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10	
		
		System.out.println("Đây là các số chẵn nguyên dương < 10");
			for( int i = 1; i < 10; i++) {
				if (i % 2 == 0) {
				System.out.print(i + " ");		
			}
		}
	System.out.println(" ");}
	
}