package com.vti.entity;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
// Question 1: Viết lệnh cho phép người dùng 
// nhập 3 số nguyên vào chương trình
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Moi nhap vao cac so nguyen");
		
		System.out.println("So thu nhat: ");
		int so1 = sc1.nextInt();
		
		System.out.println("So thu hai: ");
		int so2 = sc1.nextInt();
		
		System.out.println("So thu ba: ");
		int so3 = sc1.nextInt();
		
		System.out.println("Cac so vua nhap la: ");
		System.out.printf("%d - %d - %d%n", so1, so2, so3);
		
// Question 2: Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Moi nhap vao cac so thuc");
		
		System.out.println("so thu nhat: ");
		float n1 = sc2.nextFloat();
		
		System.out.println("So thu hai: ");
		float n2 = sc2.nextFloat();
		
		System.out.println("Cac so thuc da nhap: ");
		System.out.printf("%f - %f%n", n1, n2);
	
// Question 3: Viết lệnh cho phép người dùng nhập họ và tên	
		
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("Hay nhap ho: ");
		String ho = sc3.next();
		
		System.out.println("Hay nhap ten: ");
		String ten = sc3.next();
		
		System.out.printf("Ho va ten ban la: %s %s\n", ho, ten );
		
// QUestion 4: Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
		Scanner sc4 = new Scanner(System.in);
		
		System.out.println("Moi ban nhap nam sinh: ");
		int y = sc4.nextInt();
		
		System.out.println("Moi ban nhap thang sinh: ");
		int m = sc4.nextInt();
		
		System.out.println("Moi ban nhap ngay sinh: ");
		int d = sc4.nextInt();
		
		System.out.printf("Sinh nhat cua ban la: %d/%d/%d", y, m, d);
	}

}
