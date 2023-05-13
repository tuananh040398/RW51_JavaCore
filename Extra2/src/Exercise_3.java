import java.math.BigInteger;
import java.util.Scanner;

public class Exercise_3 {
	public static void main(String[] args) {
		System.out.println("Moi ban nhap so nguyen duong n:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
//		double kq = 1;
//		if (n == 0) {
//			System.out.println("Ket qua = 1");
//		} else {
//			for (int i = 1; i <= n; i++) {
//				kq = kq*(i);	
//			}
//		} System.out.println(kq);

//		for (int i = 0; i < n; i++) {
//
//			for (int j = 0; j < n; j++) {
//				System.out.print(" # ");
//			}
//			System.out.println("");
//		}
//		System.out.println("");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n; j++) {
				if (j > i) {
					System.out.print("");
				} else {
					System.out.print(" # ");
				}
			}
			System.out.println("");
		}
//		for (int i = 0; i < n; i++) {
//			
//			for (int j = 0; j <= i; j++) {
//				System.out.print(" # ");
//			}
//			System.out.println("");
//		}
//		System.out.println("");
//		for (int i = 0; i < n; i++) {
//			
//			for (int j = 0; j <= i; j++) {
//				System.out.print(" # ");
//			}
//			System.out.println("");
//		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("#");
				}
			}System.out.println("");
		}
	}
}