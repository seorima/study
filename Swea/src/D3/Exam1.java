package D3;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("하나의 실수를 입력하세요 : ");
		System.out.println();
		
		int number = 0;
		number=sc.nextInt();
		
		System.out.println("버림 : %d"+(int)number);
		System.out.println("반올림 : %d");
	}

}
