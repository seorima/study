package D2;

import java.util.Scanner;

public class swea1989 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int T;
		int n=0,answer=0;
	
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String str = sc.next();
			for(int i=0;i<str.length()/2;i++) {
				if(str.charAt(i)==str.charAt(str.length()-i-1)) {
					answer=1;
				}
				else {
				answer=0;
				break;}
				
			}
			
			System.out.println("#"+(test_case)+" "+answer);
			
			
			

		}
	}

}
