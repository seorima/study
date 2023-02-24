package D2;

import java.util.Scanner;

public class swea1970 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int money[] = {50000,10000,5000,1000,500,100,50,10};
		int[] result = new int[8];

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n=sc.nextInt();
			
			for(int i=0;i<8;i++) {
				result[i]=n/money[i];
				if(result[i]>0) {
					n=n-result[i]*money[i];
				}
			}
			
			
			
			System.out.println("#"+(test_case));
			for(int x : result) {
				System.out.print(x+" ");
				
			}
			System.out.println();
			

		}
	}

}
