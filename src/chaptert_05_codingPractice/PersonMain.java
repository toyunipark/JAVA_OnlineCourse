package chaptert_05_codingPractice;

public class PersonMain {

	public static void main(String[] args) {
		Person ryan = new Person();
		ryan.age = 48;
		ryan.name = "Ryan";
		ryan.marriage = false;
		ryan.kid = 2;
		
		System.out.println("����: "+ryan.age
				+"\n�̸�: "+ryan.name
				+"\n��ȥ����: "+ryan.marriage
				+"\n�ڳ��: "+ryan.kid);
			
	}

}
