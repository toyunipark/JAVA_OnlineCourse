package chapter5_practice2;

import java.util.Scanner;

public class Cafe_Test {

	public static void main(String[] args) {
				
		Scanner sc=new Scanner(System.in);
		System.out.println("���ٹ����� ������ 1, ��ٹ����� ������ 2�� ��������.");
		int choice=sc.nextInt();
		
		if (choice==1) {
			Cafe_Star star=new Cafe_Star();
			star.welcome();
		}
		else if(choice==2) {
			Cafe_Bean bean=new Cafe_Bean();
			bean.welcome();
		}	
	}
}
