
public class Exercise_3 {

	public static void main(String[] args) {

		Question_1();
		Question_2();
		Question_3();
		
	}

	private static void Question_3() {
// Question 3: Khởi tạo 1 số Integer có value là chữ "1234567"
//			Sau đó convert số trên thành datatype int
		
		Integer i = 1234567;
		int i1 = i.intValue();
		System.out.println(i1);
	}

	private static void Question_2() {
//		Question 2: Khai báo 1 String có value = "1234567"
//					Hãy convert String đó ra số int
		
		String i = "1234567";
		int i1 = Integer.parseInt(i);
		System.out.println(i1);
		
	}

	private static void Question_1() {
		// Question 1: Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//		   Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
//		   float có 2 số sau dấu thập phân)
	
	Integer salary = 5000;
	float i = (float) salary;
	
	System.out.printf("%.2f\n", i);
	}

}
