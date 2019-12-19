package chapter5_06_referenceDataType;

public class Student {
	
	int studentID;
	String studentName;
	
	Subject korean;
	Subject math;
	
	public Student(int id, String name) { // �����ڿ��� �ʱ�ȭ
		studentID = id;
		studentName=name;
		
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKoreanSubject(String name, int score) {
		korean.subjectName=name;
		korean.score=score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName=name;
		math.score=score;
	}
	
	
	public void showStudentScore() {
		int total=korean.score + math.score;
		System.out.println(studentName+"�л��� ������ "+total+"�� �Դϴ�.");
	}
	
	
}
