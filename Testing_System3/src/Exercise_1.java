import java.util.Random;
import java.util.Scanner;

public class Exercise_1 {
	
	public static void main(String[] args) {
		
		Question_1();
		Question_2();
		Question_3();
		Question_4();

	}

	private static void Question_4() {
//	Question 4: Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Moi nhap vao 2 so nguyen a va b");
		
		System.out.println("so thu nhat: ");
		int a = sc.nextInt();
		
		System.out.println("so thu hai: ");
		int b = sc.nextInt();
		
		int c = a/b;
		System.out.println("Thuong cua a va b la: " + c);
		
	}

	private static void Question_3() {
// Question 3: Lấy 2 số cuối của số ở Question 2 và in ra.

		Random rd1 = new Random();
		int i = rd1.nextInt(100000);
		int x = i%100;
		System.out.println("So co 5 chu so " + i);
		System.out.println("Co hai so cuoi la " + x);
		
	}

	private static void Question_2() {
// Question 2: Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm có số 0 ở đầu cho đủ 5 chữ số)

		Random rd1 = new Random();
		int i = rd1.nextInt(100000);

		System.out.println(i);
	}

	private static void Question_1() {

// Question 1: Khai báo 2 số lương có kiểu dữ liệu là float.
//		Khởi tạo Lương của Account 1 là 5240.5 $
//		Khởi tạo Lương của Account 2 là 10970.055$
//		Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
//		Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra

		float salary1 = 5240.5f;
		float salary2 = 10970.055f;

		int i1 = (int) salary1;
		int i2 = (int) salary2;

		System.out.println(i1);
		System.out.println(i2);
	}

}
