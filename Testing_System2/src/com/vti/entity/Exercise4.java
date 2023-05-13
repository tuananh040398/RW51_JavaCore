package com.vti.entity;
import java.util.Random;

public class Exercise4 {

	public static void main(String[] args) {

		QUestion_1();
		QUestion_2();
		QUestion_3();
	}
	private static void QUestion_3() {
//  QUestion 3: Khai báo 1 array bao gồm các tên của các bạn trong lớp, 
// 				sau đó in ngẫu nhiên ra tên của 1 bạn
		
	}
	private static void QUestion_2() {
// Question 2: In ngẫu nhiên ra 1 số thực
	
				Random rd2 = new Random();
				float i2 = rd2.nextFloat();
				System.out.println(i2);
	}

	private static void QUestion_1() {
// QUestion 1: In ngẫu nhiên ra 1 số nguyên
		
			Random rd1 = new Random();
			int i1 = rd1.nextInt();
			System.out.println(i1);
	}

}
