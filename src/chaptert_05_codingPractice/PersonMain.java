package chaptert_05_codingPractice;

public class PersonMain {

	public static void main(String[] args) {
		Person ryan = new Person();
		ryan.age = 48;
		ryan.name = "Ryan";
		ryan.marriage = false;
		ryan.kid = 2;
		
		System.out.println("나이: "+ryan.age
				+"\n이름: "+ryan.name
				+"\n결혼여부: "+ryan.marriage
				+"\n자녀수: "+ryan.kid);
			
	}

}
