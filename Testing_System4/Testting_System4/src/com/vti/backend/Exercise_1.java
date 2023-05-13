package com.vti.backend;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;

public class Exercise_1 {

	public static void main(String[] args) {

		Question_1();
		Question_2();
		Question_3();
	}

	private static void Question_3() {

		Group gr1 = new Group();
		
		Account creator2 = new Account();
//		Account[] acounts = {acc1, acc2, acc3};
		Group gr2 = new Group("Nhom2", creator2, LocalDateTime.now());
		
		Account creator3 = new Account();
		String[] userNames = {"Tuan Anh", "Chien", "Manh"};
		Group gr3 = new Group("Nhom3", creator3, userNames, LocalDateTime.now());
		System.out.printf(" Nhom nay co %s thanh vien: \n", gr3.accounts.length);
		for (Account acc : gr3.accounts) {
			System.out.println(acc.userName);
		}
	}

	private static void Question_2() {

		Account acc1 = new Account();
		
		Account acc2 = new Account(2, "email2", "userName2", "firstName2", "lastName2");
		
		Position pos3 = new Position();
		Account acc3 = new Account(3, "email3", "userName3", "firstName3", "lastName3", pos3, LocalDateTime.now());
		
		Position pos4 = new Position();
		Account acc4 = new Account(4, "email4", "userName4", "firstName4", "lastName4", pos4,
				LocalDateTime.of(2020, 07, 13, 16, 35));
	}

	private static void Question_1() {

		Department dep1 = new Department();
		Department dep2 = new Department("Sale");
		
	}
}
