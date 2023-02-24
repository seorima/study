package D2;

import java.util.Scanner;

public class swea1984 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T;

		T=sc.nextInt();
		
		
		
		
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int max=0,min=0;
			int num=0;
			int sum=0,answer=0;
			
			for(int i=0;i<10;i++) {
				num=sc.nextInt();
				sum+=num;
			
				max=Math.max(max,num);
				min=Math.min(min,num);
				
				
			}
			answer=Math.round((sum-max-min)/8);
			System.out.println("#"+(test_case)+" "+answer);

		}

	}

}
