package D3;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int money,cost=0;
		
		System.out.println("계산하실 금액을 입력하세요 : ");
		money=sc.nextInt();
		
		System.out.println("구매하실 금액을 입력하세요 : ");
		cost=sc.nextInt();
		
		System.out.println();
		
		int result =money-cost;
		
		System.out.println("거스름돈 : "+result);
		
		
		System.out.println("500원 짜리 동전: "+(result/500));
		System.out.println("100원 짜리 동전: "+((result-(result/500)*500)/100));
		System.out.println("50원 짜리 동전: ");
		
		
		
	}

}
