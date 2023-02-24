package D2;

import java.util.Scanner;

public class swea1284 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int result=0;
			int min=0;
			
			int P =sc.nextInt();
			int Q=sc.nextInt();
			int R=sc.nextInt();
			int S=sc.nextInt();
			int W=sc.nextInt();
			int Atotal=0,Btotal=0;
			
			Atotal= P*W;
			if(W<R) {
				Btotal=Q;
			}else {
				Btotal=Q+(W-R)*S;
			}
			
			result=Math.min(Atotal,Btotal);
			
			
			
			
			
			
		
			System.out.println("#"+(test_case)+" "+result);

		}
	}

}
