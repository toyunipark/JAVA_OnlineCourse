package chapter5_06_referenceDataType;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");;
		studentLee.setKoreanSubject("국어", 100);
		studentLee.setMathSubject("수학", 95);
		
		Student studentKim = new Student(101, "Kim");;
		studentKim.setKoreanSubject("국어", 99);
		studentKim.setMathSubject("수학", 97);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
		
	}

}
