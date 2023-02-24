package D2;

import java.util.Scanner;

public class swea1979 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int cnt=0;
			int totalcnt=0;
			int answer =0;
			
			int n=sc.nextInt();
			int k=sc.nextInt();
			int[][] arr = new int[n][n];
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					arr[i][j]=sc.nextInt();
					
				}
			}
			
			for(int i=0;i<n;++i) {
					for(int j=0;j<n-k;++j) {
						if(arr[i][j]==1) cnt++;
						else if (cnt>=1 && arr[i][i]==0) {
							if(cnt==k) answer++;
							cnt=0;
						}
					}
					if(cnt==k) answer++;
					cnt=0;
				
			}
			
			
			
			
			
			
		
			System.out.println("#"+(test_case)+" "+answer);

		}
	}

}
