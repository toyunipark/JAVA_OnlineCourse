package chapter5_practice2;

import java.util.Scanner;

public class Cafe_Bean {
	
	String menu=null;
	int price=0;
	int quantity=0;
	String menupan= "�Ƹ޸�ī�� 3800 ��\n" + 
			"���������� 2800 ��\n" + 
			"ī��� 4200 ��\n" + 
			"�ٴҶ�� 4800 ��";
	
	
	Scanner sc=new Scanner(System.in);
	
	public void welcome() {
		System.out.println("�ܡݡܡݡܡ� ��ٹ濡 ���� ���� ȯ���մϴ� �ܡݡܡݡܡ�");
		System.out.println(menupan);
		order();
	}
	
	public void order() {

		System.out.println("� ���Ḧ �ֹ��Ͻðڽ��ϱ�?");
		System.out.print("�Է� : ");
		menu=sc.next();

		switch(menu){
		case "�Ƹ޸�ī��":
			price=3800;
			break;
		case "����������":
			price=2800;
			break;
		case "ī���":
			price=4200;
			break;
		case "�ٴҶ��":
			price=4800;
			break;
		default:
			 menu="���� �޴�";
			 price=0;
		}
		
	
		System.out.println("�� �� �ֹ��Ͻðڽ��ϱ�?");
		System.out.print("�Է� : ");
		quantity=sc.nextInt();
		
		orderClose();
	}
	
/*	public void orderAnswer() {
		System.out.println("��� �ֹ��Ͻðڽ��ϱ�? (Y/N)");
		String answer=sc.next();
		if(answer.equals("Y")||answer.equals("y")) {
			order();
		}
		else {
			orderClose();		
		}
	}*/
		
	public void orderClose() {
		int payment = price*quantity;
		System.out.println("�ֹ��Ͻ� �޴��� "+menu+"�̰�, �� �ݾ��� "+payment+"�� �Դϴ�.");
		System.out.println("�ȳ��� ������.");
	}
		
}
