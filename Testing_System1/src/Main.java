import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

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
				
				System.out.println(phongban3.departmentId);

		// Position
				
				Position chucvu1 = new Position();
				chucvu1.positionId = 1;
				chucvu1.positionName = "Dev";
				
				Position chucvu2 = new Position();
				chucvu2.positionId = 2;
				chucvu2.positionName = "Test";
				
				Position chucvu3 = new Position();
				chucvu3.positionId = 3;
				chucvu3.positionName = "Scrum_Master";
				
				Position chucvu4 = new Position();
				chucvu4.positionId = 4;
				chucvu4.positionName = "PM";
				
				System.out.println(chucvu1.positionName);
				
		// Account
				
				Account account1 = new Account();
				account1.accountId = 1;
				account1.email = "nguyentuananh01@gmail.com";
				account1.userName = "tuananh";
				account1.fullName = "nguyentuananh";
				account1.department = phongban1;
				account1.position = chucvu1;
				account1.createDate =LocalDateTime.now();
				
				Account account2 = new Account();
				account2.accountId = 2;
				account2.email = "nguyentuanem02@gmail.com";
				account2.userName = "tuanem";
				account2.fullName = "nguyentuanem";
				account2.department = phongban2;
				account2.position = chucvu2;
				account2.createDate =LocalDateTime.now();

				Account account3 = new Account();
				account3.accountId = 3;
				account3.email = "nguyentuanchi@gmail.com";
				account3.userName = "tuanchi";
				account3.fullName = "nguyentuanchi";
				account3.department = phongban3;
				account3.position = chucvu3;
				account3.createDate =LocalDateTime.now();
				
				System.out.println(account2.email);

		// Group
				
				Group group1 = new Group();
				group1.groupId = 1;
				group1.groupName = "RW1";
				group1.creator = account1;
				group1.createDate = LocalDateTime.now();
				
				Group group2 = new Group();
				group2.groupId = 2;
				group2.groupName = "RW2";
				group2.creator = account2;
				group2.createDate = LocalDateTime.now();

				Group group3 = new Group();
				group3.groupId = 3;
				group3.groupName = "RW3";
				group3.creator = account3;
				group3.createDate = LocalDateTime.now();
				
				System.out.println(group3.groupName);
				
		// GroupAccount
				
				GroupAccount groupaccount1 = new GroupAccount();
				groupaccount1.account = account1;
				groupaccount1.joinDate = LocalDateTime.now();
				
				GroupAccount groupaccount2 = new GroupAccount();
				groupaccount2.account = account2;
				groupaccount2.joinDate = LocalDateTime.now();
				
				GroupAccount groupaccount3 = new GroupAccount();
				groupaccount3.account = account3;
				groupaccount3.joinDate = LocalDateTime.now();
				
				System.out.println(groupaccount1.account);
				
		// TypeQuestion
				
				TypeQuestion typequestion1 = new TypeQuestion();
				typequestion1.typeId = 1;
				typequestion1.typeName = "Essay";
				
				TypeQuestion typequestion2 = new TypeQuestion();
				typequestion2.typeId = 2;
				typequestion2.typeName = "Multiple_Choice";
				
				System.out.println(typequestion1.typeName);
				
		// CategoryQuestion
				
				CategoryQuestion CQ1 = new CategoryQuestion();
				CQ1.categoryId = 1;
				CQ1.categoryName = "JAVA";
				
				CategoryQuestion CQ2 = new CategoryQuestion();
				CQ2.categoryId = 2;
				CQ2.categoryName = ".NET";
				
				CategoryQuestion CQ3 = new CategoryQuestion();
				CQ3.categoryId = 3;
				CQ3.categoryName = "SQL";
				
				CategoryQuestion CQ4 = new CategoryQuestion();
				CQ4.categoryId = 4;
				CQ4.categoryName = "Postman";
				
				CategoryQuestion CQ5 = new CategoryQuestion();
				CQ5.categoryId = 5;
				CQ5.categoryName = "Ruby";
				
				System.out.println(CQ4.categoryName);
				
		// Question	
				
				Question cauhoi1 = new Question();
				cauhoi1.questionId = 1;
				cauhoi1.content = "cau hoi so 1";
				cauhoi1.categoryQuestion = CQ1;
				cauhoi1.typeQuestion = typequestion1;
				cauhoi1.creator = account1;
				cauhoi1.createDate = LocalDateTime.now();
				
				Question cauhoi2 = new Question();
				cauhoi2.questionId = 2;
				cauhoi2.content = "cau hoi so 2";
				cauhoi2.categoryQuestion = CQ2;
				cauhoi2.typeQuestion = typequestion1;
				cauhoi2.creator = account2;
				cauhoi2.createDate = LocalDateTime.now();
				
				Question cauhoi3 = new Question();
				cauhoi3.questionId = 3;
				cauhoi3.content = "cau hoi so 3";
				cauhoi3.categoryQuestion = CQ3;
				cauhoi3.typeQuestion = typequestion2;
				cauhoi3.creator = account3;
				cauhoi3.createDate = LocalDateTime.now();
				
				System.out.println("thoi gian tao cau hoi la " + cauhoi2.createDate);
				
		// Answer
				
				Answer answer1 = new Answer();
				answer1.answerId = 1;
				answer1.content = "cau tra loi 1";
				answer1.question = cauhoi1;
				answer1.isCorrect = true;
				
				Answer answer2 = new Answer();
				answer2.answerId = 2;
				answer2.content = "cau tra loi 2";
				answer2.question = cauhoi2;
				answer1.isCorrect = true;
				
				Answer answer3 = new Answer();
				answer3.answerId = 3;
				answer3.content = "cau tra loi 3";
				answer3.question = cauhoi3;
				answer1.isCorrect = false;
				
				System.out.println(answer1.isCorrect);
				
		// Exam
				
				Exam exam1 = new Exam();
				exam1.examId = 1;
				exam1.code = 001;
				exam1.title = "de thi so 1";
				exam1.categoryQuestion = CQ1;
				exam1.duration = 60;
				exam1.creator = account1;
				exam1.createDate = LocalDateTime.now();
				
				Exam exam2 = new Exam();
				exam2.examId = 2;
				exam2.code = 002;
				exam2.title = "de thi so 2";
				exam2.categoryQuestion = CQ2;
				exam2.duration = 60;
				exam2.creator = account2;
				exam2.createDate = LocalDateTime.now();
				
				Exam exam3 = new Exam();
				exam3.examId = 3;
				exam3.code = 003;
				exam3.title = "de thi so 3";
				exam3.categoryQuestion = CQ3;
				exam3.duration = 60;
				exam3.creator = account3;
				exam3.createDate = LocalDateTime.now();
				
				System.out.println("day la " + exam1.title);
				
		// ExamQuestion
				
				ExamQuestion EQ1 = new ExamQuestion();
				EQ1.exam = exam1;
				EQ1.question = cauhoi1;
				
				ExamQuestion EQ2 = new ExamQuestion();
				EQ2.exam = exam2;
				EQ2.question = cauhoi2;
				
				ExamQuestion EQ3 = new ExamQuestion();
				EQ3.exam = exam3;
				EQ3.question = cauhoi3;
				
				System.out.println(EQ3.exam.duration);
	}

}
