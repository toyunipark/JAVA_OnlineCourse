package chapter5_practice2;

import java.util.Scanner;

public class Cafe_Test {

	public static void main(String[] args) {
				
		Scanner sc=new Scanner(System.in);
		System.out.println("별다방으로 가려면 1, 콩다방으로 가려면 2를 누르세요.");
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
