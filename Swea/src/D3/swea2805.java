package D3;

import java.util.Scanner;

public class swea2805 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int sum=0;
			int n=sc.nextInt();
			int mid = n/2;
			int[][] arr = new int[n][n];
			
			for(int i=0;i<n;i++) {
				String str = sc.next();
				for(int j=0;j<n;j++) {
					arr[i][j]=str.charAt(j)-'0';
				}
			}
			

			int area=0;
			
			
			for(int i=0;i<n;i++) {
				int st=mid-area;
				int end=mid+area;
				for(int j=st;j<=end;j++) {
					sum+=arr[i][j];
				}
				if(i>=mid) area--;
				else area++;
			}
			
			
			
		
			System.out.println("#"+(test_case)+" "+sum);

		}
	}

}
