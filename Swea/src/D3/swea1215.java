package D3;

import java.util.ArrayList;
import java.util.Scanner;

public class swea1215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T;
		//T=sc.nextInt();
		

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			
			int n=sc.nextInt();
			int cnt=0;
			char[][] arr = new char[8][8];
			char[] word = new char[4];
			
			for(int i=0;i<8;i++) {
				String str = sc.next();
				for(int j=0;j<8;j++) {
					arr[i][j]=str.charAt(j);
				}
			}
			
			
			for(int i=0;i<8;i++) {
				int k=0;
				for(int j=k;j<8-n;j++) {
				word[k]=arr[i][j];
					
					k++;
				}
				for(int l=0;l<n/2;l++) {
					if(word[l]==word[n-l-1]) {
						cnt++;
					}
				}
			}
			
			for(int i=0;i<8;i++) {
				int k=0;
				for(int j=k;j<8-n;j++) {
				word[k]=arr[j][i];
					
					k++;
				}
				for(int l=0;l<n/2;l++) {
					if(word[l]==word[n-l-1]) {
						cnt++;
					}
				}
			}
			
		
			System.out.println("#"+(test_case)+" "+cnt);

		}
	}

}
