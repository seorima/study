package D3;

import java.util.Scanner;

public class swea1209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	//	int T;
	//	T=sc.nextInt();
		

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int[][] arr = new int[100][100];
			
			int max=Integer.MIN_VALUE;
			
			for(int i=0;i<100;i++) {
				for(int j=0;j<100;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			
			for(int i=0;i<100;i++) {
				int sum=0;
				for(int j=0;j<100;j++) {
					sum+=arr[i][j];
				}
				max=Math.max(max,sum);
			}
			
			for(int i=0;i<100;i++) {
				int sum=0;
				for(int j=0;j<100;j++) {
					sum+=arr[j][i];
				}
				max=Math.max(max,sum);
			}
			
			
			for(int i=0;i<100;i++) {
				int sum=0;
				sum+=arr[i][i];
				max=Math.max(max,sum);
			}
			
			for(int i=0;i<100;i++) {
				int sum=0;
					sum+=arr[i][100-1-i];
				
				max=Math.max(max,sum);
			}
			
			
		
			System.out.println("#"+(test_case)+" "+max);

		}
	}

}
