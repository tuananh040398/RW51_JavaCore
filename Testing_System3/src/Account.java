import java.time.LocalDateTime;

public class Account {
	int accountId;
	String email;
	String userName;
	String fullName;
	Department department;
	Position position;
	LocalDateTime createDate;
	Group[] groups;

	public Account() {
		createDate = LocalDateTime.now();
	}

	public Account(int Id, String email, String userName, String firstName, String lastName) {

		this.accountId = Id;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + " " + lastName;
	}

	public Account(int Id, String email, String userName, String firstName, String lastName, Position position) {

		this.accountId = Id;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + " " + lastName;
		this.position = position;
		this.createDate = LocalDateTime.now();
	}
//	public Account(int Id, String email, String userName, String firstName, String lastName, Position position) {
//
//		this.accountId = Id;
//		this.email = email;
//		this.userName = userName;
//		this.fullName = firstName + " " + lastName;
//		this.position = position;
//		this.createDate = LocalDateTime.of(null, null)
}
