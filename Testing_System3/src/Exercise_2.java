import java.time.LocalDateTime;

public class Exercise_2 {

	public static void main(String[] args) {
// Question: Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi
//		tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
//			 Email: "Email 1"
//			 Username: "User name 1"
//			 FullName: "Full name 1"
//			 CreateDate: now

		Account[] accs = new Account[5];
		
		for (int i=0; i < accs.length; i++) {
			accs[i] = new Account();
			accs[i].email = "email" + (i+1);
			accs[i].userName = "userName" + (i+1);
			accs[i].fullName = "fullName" + (i+1);
			accs[i].createDate = LocalDateTime.now();
			
		}
		
		for (Account account : accs) {
			System.out.printf("%s - %s - %s - %tD %tT\n", account.email, account.userName, account.fullName, account.createDate, account.createDate);
		}
	}
}
