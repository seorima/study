package D1;

import java.util.Scanner;

public class swea2072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int sum = 0;
		for (int i = 0;i<T;i++) {
			for (int j = 0;j<10;j++) {
		int num = scan.nextInt();
			if(num%2!=0) {
				sum+=num;
			}
			else {
				
			}
				
		}
			System.out.println("#"+(i+1)+" "+sum);
			sum=0;
			
		}
		
	}

}
