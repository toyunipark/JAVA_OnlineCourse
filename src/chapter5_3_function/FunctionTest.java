package chapter5_3_function;

public class FunctionTest {

	public static int addNum(int num1, int num2) { // return ���� ������(integer)�̹Ƿ�, int�� ����
		int result;
		result = num1+num2;
		return result;
	}
	
	public static void sayHello(String greeting) { // return ���� ���� �� => void
		System.out.println(greeting);
	}
	
	
	public static int calcSum() {
		int sum=0;
		int i;
		
		for (i = 0; i <= 100; i++) {
			sum+=i;
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
	
		int total = addNum(n1, n2);
		System.out.println(total);
		
		sayHello("HELLO");
		
		int calResult=calcSum();
		System.out.println(calResult);
	}

}
