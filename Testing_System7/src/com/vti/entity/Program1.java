package com.vti.entity;

public class Program1 {

	public static void main(String[] args) {
		Student sv1 = new Student(1, "Nguyen Van A");
		Student sv2 = new Student(2, "Nguyen Van B");
		Student sv3 = new Student(3, "Nguyen Van C");

		Student[] ds = { sv1, sv2, sv3 };

		for (Student student : ds) {
			System.out.println(student.toString());
		}

		Student.setColleString("Dai hoc Cong Nghiep");

		for (Student student : ds) {
			System.out.println(student.toString());
		}
		
		// B1
		
		sv1.givemoney(100000);
		sv2.givemoney(100000);
		sv3.givemoney(100000);
		
		Student.showmoneyGroup();
		
		//B2
		
		sv1.takemoney(50000, "mua bim bim, keo ve lien hoan");
		
		//B3
		
		sv2.takemoney(20000, "mua banh mi");
		
		//B4
		
		sv3.takemoney(150000, "mua do");
		
		//B5
		
		sv1.givemoney(50000);
		sv2.givemoney(50000);
		sv3.givemoney(50000);
		Student.showmoneyGroup();
	}
}
