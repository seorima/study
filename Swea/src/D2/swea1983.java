package D2;

import java.util.Arrays;
import java.util.Scanner;

public class swea1983 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T;

		T=sc.nextInt();
		
		String answer="";
		int n=0,mid=0,fin=0,part=0,k=0;
		
		String grade[] = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};
		
		
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			n=sc.nextInt();
			k=sc.nextInt();
			double[] score = new double[n];
			for(int i=0;i<n;i++) {
				mid=sc.nextInt();
				fin=sc.nextInt();
				part=sc.nextInt();
				score[i]=mid*0.35+fin*0.45+part*0.2;
				
				
			}
			double tmp=score[k-1];
			Arrays.sort(score);
			
			for(int j=0;j<n;j++) {
				if(score[j]==tmp) {
					System.out.println("#"+(test_case)+" "+grade[j*10/n]);
					}
				
			}
			
			
			

		}

		
	}

}
