import java.util.Arrays;
import java.util.Collections;

public class Exercise_5 {

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
		
		Department[] phongbans = {phongban1, phongban2, phongban3};
		
		
		Question_1(phongban1);
		Question_2(phongbans);
		Question_3(phongban1);
		Question_4(phongban1);
		Question_5(phongban1, phongban2);
		Question_6();

	}

	private static void Question_6() {

//		Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh
//		sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
//		VD:
//		Accounting
//		Boss of director
//		Marketing
//		Sale
//		Waiting room
		
		String [] phongban = {"Waiting room", "Accounting", "Sale","Boss of director", "Marketing" };
		
		Department [] DSphongban = new Department[phongban.length];
		
		for (int i = 0; i < DSphongban.length; i++) {
			DSphongban[i] = new Department();
			DSphongban[i].departmentId = (i+1);
			DSphongban[i].departmentName = phongban[i]; 
		}
		
		System.out.println("Truoc khi sap xep");
		
		for (Department depart : DSphongban) {
			System.out.println(depart.toString());
		}
		
		System.out.println("Sau khi sap xep (ASC)");
		
		Collections.sort(Arrays.asList(DSphongban), new DepComparator_ASC());
		
		for (Department depart : DSphongban) {
			System.out.println(depart.toString());
		}
	}
	
	
	private static void Question_5(Department phongban1, Department phongban2) {

//		Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau
//		không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
		
		if (phongban1.departmentName.equals(phongban2.departmentName)) {
			System.out.println("Hai phong ban bang nhau");
		} else {
			System.out.println("Hai phong ban khong bang nhau");
		}
	}

	private static void Question_4(Department phongban1) {

// Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
		
		if (phongban1.departmentName.equals("Phong A")) {
			System.out.println("Day la phong A");
		} else {
			System.out.println("Day khong phai phong A");
		}
	}

	private static void Question_3(Department phongban1) {

// Question 3: In ra địa chỉ của phòng ban thứ 1
		
		System.out.println(phongban1.hashCode());
	}

	private static void Question_2(Department[] phongbans) {

// Question 2: In ra thông tin của tất cả phòng ban
		
		for (Department department : phongbans) {
			System.out.println(department.toString());
		}
	}


	private static void Question_1(Department phongban1) {

//	Question 1: In ra thông tin của phòng ban thứ 1 (sử dụng toString())

//		Department phongban = new Department();
//		phongban.departmentId = 1;
//		phongban.departmentName = "HCNS";

		System.out.println(phongban1.toString());

	}

}
