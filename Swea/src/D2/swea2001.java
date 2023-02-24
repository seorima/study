package D2;

import java.util.Scanner;

public class swea2001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for (int test=0;test<T;test++) {
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] arr = new int[n][n];
		
		for(int k=0;k<n;k++) {
			for(int l=0;l<n;l++) {
				arr[k][l]= scan.nextInt();
			}
		}
		
		int max=0;
		for(int i=0;i<n-m+1;i++) {
			for(int j=0;j<n-m+1;j++) {
				int sum=0;
				for(int a=0;a<m;a++) {
					for(int b=0;b<m;b++) {
						sum+=arr[i+a][j+b];
					}
				}
				max=Math.max(max,sum);
			}
		}
		System.out.println("#"+(test+1)+" "+max);
		
		
		}
	}

}
