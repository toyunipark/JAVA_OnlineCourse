package chapter5_01_classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student("�̼���"); // Ŭ������ ������ = new Ŭ������();      �����ڷ� ����
//		studentLee.studentName = "�̼���";
		studentLee.address = "����Ư���� ���α�";
		
		studentLee.showStudentInfo(); // ������ �޼��带 ��ȯ�Ѵ�.
		
		Student studentKim = new Student(200841146, "������");
//		studentKim.studentName = "������";
//		studentKim.address = "��󳲵� ���ֽ�";
		
		studentKim.showStudentInfo();
		
//		System.out.println(studentLee); // toString�� ȣ��Ǿ ����. 
//		System.out.println(studentKim); // ���� ������ ���� ���� ����� ���, ��Ű������ ���Ե� full name @ �ּҰ� (�� �޸�, �ؽ��ڵ尪, 16������ ǥ��)
	}

}
