package D2;

import java.util.Scanner;

public class swea1948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int[] day = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			int m1=sc.nextInt();
			int d1=sc.nextInt();
			int m2=sc.nextInt();
			int d2=sc.nextInt();
			
			int m_result = 0;
			int d_result = 0, result=0;
			
			m_result=m2-m1;
			if(m_result==0) {
				result=d2-d1+1;
			}
			else {
			
				for(int i=m1+1;i<m2;i++) {
					result+=day[i];
				}
				result+=d2+(day[m1]-d1+1);
			}
			
			
			
			
			
		
			System.out.println("#"+(test_case)+" "+result);

		}
		

	}

}
