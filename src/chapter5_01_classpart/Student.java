package chapter5_01_classpart;

public class Student { //Ŭ�������� �빮�ڷ� ����Ѵ�. public Ŭ�������� �ڹ� ���ϸ�� �����ϸ�,  �ٸ� ��� ���� �߻���.
	//�Ӽ��� ������ ǥ���Ѵ�. => �������
	public int studentID; // ���������� : public / private / protected / default
	public String studentName; // String�� java.lang �ȿ� �ִ� Ŭ�����̴�. ����, �빮�ڷ� ����
	public String address;	
	// ����� ������ ���� '�޼���'�� ����Ѵ�. �Լ��� �����̴�.
	
//	public Student() {} // default constructor
	
	public Student(String name) {
		studentName=name;
	}
	
	
	
	public Student(int id, String name) {
		studentID=id;
		studentName=name;
		address="�ּҾ���";
	}
	
	
	public void showStudentInfo() // ��ȣ �ȿ� �Ű������� �� �� �ִ�.  // ��ȯ ��(return)�� ���� ��� void �� ���
	{
		System.out.println(studentName + ", " + address);
	}
	
}
