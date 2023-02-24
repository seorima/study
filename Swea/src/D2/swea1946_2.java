package D2;

import java.util.Scanner;

public class swea1946_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n=sc.nextInt();
			
			String[] str = new String[n];
			int[] num =  new int[n];
			int total=0;
			
			for(int i=0;i<n;i++) {
				str[i]=sc.next();
				num[i]=sc.nextInt();
				total+=num[i];				
				
			}
			String[] arr = new String[total];
			int idx=0;
			for(int i=0;i<n;i++) {
				for(int j=0;j<num[i];j++) {
					arr[idx]=str[i];
					idx++;
				}
				
			}
			System.out.println("#"+(test_case));
			for(int b=0;b<idx;b++) {
				if(b!=0 && b%10==0) {
					System.out.println();
				}
				System.out.print(arr[b]);
			
			
			}
			System.out.println();

		}
	}

}
