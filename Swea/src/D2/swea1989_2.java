package D2;

import java.util.ArrayList;
import java.util.Scanner;

public class swea1989_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T;
		int n=0;
	
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			
			String str = sc.next();
			StringBuffer sb = new StringBuffer(str);
			String tmp=sb.reverse().toString();
			if(str.equals(tmp)) System.out.println("#"+(test_case)+" 1");
			else System.out.println("#"+(test_case)+" 0");
			
			
			
			

		}
		
	}

}
