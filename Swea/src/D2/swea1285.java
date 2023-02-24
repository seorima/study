package D2;

import java.util.Scanner;

public class swea1285 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		
	
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int cnt=0;
			int min =1001;
			int tmp=0;
			int n=sc.nextInt();
			int num=0;
			int[] arr = new int[n];
			
			for(int i=0;i<n;i++) {
				num=sc.nextInt();
				
				tmp=Math.abs(num);
				arr[i]=tmp;
				min=Math.min(min,tmp);
				
			}
			for(int i=0;i<n;i++) {
				if(arr[i]==min) {
					cnt++;
				}
			}			
			
			
			
		
			System.out.println("#"+(test_case)+" "+min+" "+cnt);

		}
	}
		

}
