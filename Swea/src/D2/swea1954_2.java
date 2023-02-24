package D2;

import java.util.Scanner;

public class swea1954_2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int[] di = {0,1,0,-1};
		int[] dj = {1,0,-1,0};
		
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			int n= sc.nextInt();
			int[][] arr = new int[n][n];
			int num=1;
			int i=0,j=0,dir=0;
			
			while(num<=n*n) {
				arr[i][j]=num;
				num++;
				
				i+=di[dir];
				j+=dj[dir];
				
				if(i<0 || j<0 || i>=n || j>=n || arr[i][j]!=0) {
					i-=di[dir];
					j-=dj[dir];
					
					dir=(dir+1)%4;
					
					i+=di[dir];
					j+=dj[dir];
					
				}
					
					
					
			}
			
			
			
			
			System.out.println("#"+(test_case)+" ");
			
			for(int a=0;a<n;a++) {
				for(int b=0;b<n;b++) {
					System.out.print(arr[a][b]+ " ");
				}
				System.out.println();
			}		
			
		}
	}

}
