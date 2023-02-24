package D2;

import java.util.Scanner;

public class swea1959 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			int n =sc.nextInt();
			int m =sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[m];
			
			int max = 0;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			for(int i=0;i<m;i++) {
				b[i]=sc.nextInt();
			}
			
			
			if(n<m) {
				for(int i=0;i<m-n+1;i++) {
					int sum=0;
					for(int j=0;j<n;j++) {
						sum+=a[j]*b[j+j];
					}
					max = Math.max(max,sum);
				}
			}
			if(n>m) {
				for(int i=0;i<n-m+1;i++) {
					int sum=0;
					for(int j=0;j<m;j++) {
						sum+=a[i+j]*b[j];
					}
					max = Math.max(max,sum);
				}
			}
			else {
				int sum=0;
				for(int k=0;k<n;k++) {
					sum+=a[k]*b[k];
				}
				max = Math.max(max,sum);
			}
		
			System.out.println("#"+(test_case)+" "+max);

		}
	}

}
