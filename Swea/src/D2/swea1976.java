package D2;

import java.util.Scanner;

public class swea1976 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int hsum=0,msum=0;
			
			for(int i=0;i<2;i++) {
				int hour =sc.nextInt();
				int min =sc.nextInt();
				hsum+=hour;
				msum+=min;
				
			}
			if(msum>=60) {
				hsum+=hsum/60;
				msum=msum%60;
				hsum++;
			}
			if(hsum>12) {
				if(hsum%12==0) hsum=12;
				else hsum=hsum%12;
			}
			
			System.out.println("#"+(test_case)+" "+hsum+" "+msum);
		}
		
	}

}
