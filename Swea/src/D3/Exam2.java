package D3;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int money,cost=0;
		
		System.out.println("����Ͻ� �ݾ��� �Է��ϼ��� : ");
		money=sc.nextInt();
		
		System.out.println("�����Ͻ� �ݾ��� �Է��ϼ��� : ");
		cost=sc.nextInt();
		
		System.out.println();
		
		int result =money-cost;
		
		System.out.println("�Ž����� : "+result);
		
		
		System.out.println("500�� ¥�� ����: "+(result/500));
		System.out.println("100�� ¥�� ����: "+((result-(result/500)*500)/100));
		System.out.println("50�� ¥�� ����: ");
		
		
		
	}

}
