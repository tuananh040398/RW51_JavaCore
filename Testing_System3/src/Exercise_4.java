import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {

		Question_1();
		Question_2();
		Question_3();
		Question_4();
		Question_5();
		Question_6();
		Question_8();
		Question_9();

	}

	private static void Question_9() {

// Question 9: In ra tất cả các group "Java"

		String[] grName = { "Java", "C#", "Python", "Unity" };
		Group[] DSgroup = new Group[grName.length];

		for (int i = 0; i < DSgroup.length; i++) {
			DSgroup[i] = new Group();
			DSgroup[i].groupId = (i + 1);
			DSgroup[i].groupName = grName[i];

		}
		for (Group group : DSgroup) {
			if (group.groupName.equals("Java")) {
				System.out.println(group);
			}
		}
	}

	private static void Question_6() {

//		Question 6: Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//					sau đó hệ thống sẽ tách ra họ, tên , tên đệm

		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap ho va ten: ");
		String hoten = sc.nextLine();

		while (hoten.contains("  ")) {
			hoten = hoten.replace("  ", " ");
		}

		String[] s = hoten.split(" ");

		String ho = s[0];
		String ten = s[s.length - 1];
		String dem = hoten.substring(ho.length(), hoten.length() - ten.length()).trim();

		System.out.println("Ho la: " + ho);
		System.out.println("Ten dem la: " + dem);
		System.out.println("Ten la: " + ten);

	}

	private static void Question_8() {

//		Question 8: In ra tất cả các group có chứa chữ "Java"

		String[] grName = { "Java", "C#", "Python", "Unity" };
		Group[] DSgroup = new Group[grName.length];

		for (int i = 0; i < DSgroup.length; i++) {
			DSgroup[i] = new Group();
			DSgroup[i].groupId = (i + 1);
			DSgroup[i].groupName = grName[i];

		}
		for (Group group : DSgroup) {
			if (group.groupName.contains("Java")) {
				System.out.println(group);
			}
		}
	}

	private static void Question_3() {

//		Question 3: Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chư
//					viết hoa chữ cái đầu thì viết hoa lên

		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap ten: ");

		String ten = sc.nextLine();

		String s1 = ten.substring(0, 1);
		String s2 = ten.substring(1);

		System.out.println(s1.toUpperCase().concat(s2));

	}

	private static void Question_5() {

// Question 5:Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
//			  dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ

		Scanner sc = new Scanner(System.in);

		System.out.println("Moi nhap ho: ");
		String a = sc.nextLine();

		System.out.println("Moi nhap ten: ");
		String b = sc.nextLine();

		System.out.println("Ho va ten la :" + a + b);
	}

	private static void Question_4() {

// Question 4: Viết chương trình để người dùng nhập vào tên và in từng ký tự trong tên
//		của người dùng ra

		Scanner sc = new Scanner(System.in);

		System.out.println("Xin moi nhap ten: ");
		String ten = sc.nextLine();

		for (int i = 0; i < ten.length(); i++) {
			System.out.println("ky tu thu " + (i + 1) + " la: " + ten.charAt(i));
		}
	}

	private static void Question_2() {
// Question 2 : Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap xau 1: ");
		String a = sc.nextLine();

		System.out.println("Nhap xau 2: ");
		String b = sc.nextLine();

		System.out.println("Noi xau ki tu 1 va 2: " + a + " " + b);

	}

	private static void Question_1() {
// Question 1: Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
// 			   thể cách nhau bằng nhiều khoảng trắng );

		Scanner sc = new Scanner(System.in);

		System.out.println("Moi ban nhap: ");
		String a = sc.nextLine();

		while (a.contains("  ")) {
			a = a.replace("  ", " ");
		}

		String[] dem = a.split(" ");
		System.out.println("So ki tu la: " + dem.length);
	}

}
