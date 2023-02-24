package D2;

import java.util.Scanner;

public class swea1945 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n= sc.nextInt();
			
			int[] num = {2,3,5,7,11};
			int[] result = new int[5];
			
			
			for(int i=0;i<5;i++) {
				while (true) {
				if(n%num[i]==0) {
					result[i]++;
					n=n/num[i];
				}
				else break;
			}
			}
			
			
			
			
		
			System.out.print("#"+(test_case)+" ");
			for(int x : result) {
				System.out.print(x+" ");
				
			}
			System.out.println();
		}

	}

}
