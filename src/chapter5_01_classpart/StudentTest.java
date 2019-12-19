package chapter5_01_classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student("이순신"); // 클래스명 변수명 = new 클래스명();      생성자로 생성
//		studentLee.studentName = "이순신";
		studentLee.address = "서울특별시 종로구";
		
		studentLee.showStudentInfo(); // 생성한 메서드를 소환한다.
		
		Student studentKim = new Student(200841146, "김유신");
//		studentKim.studentName = "김유신";
//		studentKim.address = "경상남도 경주시";
		
		studentKim.showStudentInfo();
		
//		System.out.println(studentLee); // toString이 호출되어서 나옴. 
//		System.out.println(studentKim); // 참조 변수에 대한 값을 출력할 경우, 패키지명을 포함된 full name @ 주소값 (힙 메모리, 해시코드값, 16진수로 표현)
	}

}
