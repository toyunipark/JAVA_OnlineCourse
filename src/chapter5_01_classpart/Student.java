package chapter5_01_classpart;

public class Student { //Ŭ�������� �빮�ڷ� ����Ѵ�. public Ŭ�������� �ڹ� ���ϸ�� �����ϸ�,  �ٸ� ��� ���� �߻���.
	//�Ӽ��� ������ ǥ���Ѵ�. => �������
	public int studentID; // ���������� : public / private / protected / default
	public String studentName; // String�� java.lang �ȿ� �ִ� Ŭ�����̴�. ����, �빮�ڷ� ����
	public String address;	
	// ����� ������ ���� '�޼���'�� ����Ѵ�. �Լ��� �����̴�.
	
	public void showStudentInfo() // ��ȣ �ȿ� �Ű������� �� �� �ִ�.  // ��ȯ ��(return)�� ���� ��� void �� ���
	{
		System.out.println(studentName + " ," + address);
	}
	
}
