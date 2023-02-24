package D2;

import java.util.Scanner;

public class swea1288 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int[] arr = new int[10];
		int cnt=0;
		int n=1;
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			String num = sc.next();
			int N = Integer.parseInt(num);
			
			while(true)
			{
				for(int i=0;i<num.length();i++) {
					int tmp=Integer.parseInt(num.substring(i,i+1));
					
					if(arr[tmp]==0) {
						arr[tmp]=1;
						cnt++;
					}
				}
				if(cnt==10) break;
				else {
					n++;
					num=Integer.toString(N*n);
				}
			}
			
			
			
			
			
		
			System.out.println("#"+(test_case)+" "+num);

		}
	}

}
