package chapter5_06_referenceDataType;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");;
		studentLee.setKoreanSubject("����", 100);
		studentLee.setMathSubject("����", 95);
		
		Student studentKim = new Student(101, "Kim");;
		studentKim.setKoreanSubject("����", 99);
		studentKim.setMathSubject("����", 97);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
		
	}

}
