package chapter5_practice2;

import java.util.Scanner;

public class Cafe_Bean {
	
	String menu=null;
	int price=0;
	int quantity=0;
	String menupan= "아메리카노 3800 원\n" + 
			"에스프레소 2800 원\n" + 
			"카페라떼 4200 원\n" + 
			"바닐라라떼 4800 원";
	
	
	Scanner sc=new Scanner(System.in);
	
	public void welcome() {
		System.out.println("●◎●◎●◎ 콩다방에 오신 것을 환영합니다 ●◎●◎●◎");
		System.out.println(menupan);
		order();
	}
	
	public void order() {

		System.out.println("어떤 음료를 주문하시겠습니까?");
		System.out.print("입력 : ");
		menu=sc.next();

		switch(menu){
		case "아메리카노":
			price=3800;
			break;
		case "에스프레소":
			price=2800;
			break;
		case "카페라떼":
			price=4200;
			break;
		case "바닐라라떼":
			price=4800;
			break;
		default:
			 menu="없는 메뉴";
			 price=0;
		}
		
	
		System.out.println("몇 잔 주문하시겠습니까?");
		System.out.print("입력 : ");
		quantity=sc.nextInt();
		
		orderClose();
	}
	
/*	public void orderAnswer() {
		System.out.println("계속 주문하시겠습니까? (Y/N)");
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
		System.out.println("주문하신 메뉴는 "+menu+"이고, 총 금액은 "+payment+"원 입니다.");
		System.out.println("안녕히 가세요.");
	}
		
}
