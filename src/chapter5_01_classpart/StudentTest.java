package chapter5_01_classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); // 클래스명 변수명 = new 클래스명();     
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 강남구";
		
		studentLee.showStudentInfo();
		
		
	}

}
