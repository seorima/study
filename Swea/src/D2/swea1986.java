package D2;

import java.util.Scanner;

public class swea1986 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T;
		int n=0;
		
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int sum=0;
			n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				if(i%2==1) sum+=i;
				else sum-=i;
			}
			System.out.println("#"+(test_case)+" "+sum);

		}
		
	}

}
