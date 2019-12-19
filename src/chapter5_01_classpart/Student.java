package chapter5_01_classpart;

public class Student { //클래스명은 대문자로 사용한다. public 클래스명은 자바 파일명과 동일하며,  다를 경우 오류 발생함.
	//속성을 변수로 표현한다. => 멤버변수
	public int studentID; // 접근제어자 : public / private / protected / default
	public String studentName; // String은 java.lang 안에 있는 클래스이다. 따라서, 대문자로 시작
	public String address;	
	// 기능을 구현할 때는 '메서드'를 사용한다. 함수의 일종이다.
	
	public void showStudentInfo() // 괄호 안에 매개변수가 들어갈 수 있다.  // 반환 값(return)이 없는 경우 void 를 사용
	{
		System.out.println(studentName + " ," + address);
	}
	
}
