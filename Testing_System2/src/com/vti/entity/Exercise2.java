package com.vti.entity;
import java.time.LocalDateTime;
import java.util.Locale;

public class Exercise2 {

	public static void main(String[] args) {
	
		Question_1();
		Question_2();
		Question_3();
		Question_4();
		Question_5();
		
	}

	private static void Question_5() {
// Question 5 : Lấy thời gian bây giờ và in ra theo định dạng sau:
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.printf("%1$td/%1$tm/%1$tY %1$tHh:%1$tMp:%1$tSs", currentTime);
		
	}

	private static void Question_4() {
// Question 4 : 
// Khai báo Họ và tên của 1 học sinh 
// và in ra họ và tên học sinh đó theo định dạng như sau:
// Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
// Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.		
			
		String a = "Nguyễn Văn A";
		System.out.printf("Tên tôi là \"%s\" và tôi đang độc thân \n", a );
		
	}

	private static void Question_3() {
// Question 3: Khai báo 1 số thực = 5,567098 và sử dụng lệnh 
// System out printf để in ra số thực đó chỉ bao gồm 4 số đằng sau
		
		float i3 = 5.567098f;
		System.out.printf("%.4f%n", i3);
	}

	private static void Question_2() {
		
// Question 2: Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh 
// System out printf để in ra số nguyên đó thành định dạng như sau: 100,000,000
			
			int bnb = 100000000;
			System.out.printf(Locale.FRANCE, "%,d %n", bnb);
	
	}

	private static void Question_1() {
// Question 1: Khai báo 1 số nguyên = 5 
// và sử dụng lệnh System out printf để in ra số nguyên đó	
		
			int i = 5;
			System.out.printf("%d%n", i);
		
	}

}
