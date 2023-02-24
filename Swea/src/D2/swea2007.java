package D2;

import java.util.Scanner;

public class swea2007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i=0;i<T;i++) {
			
			int N = scan.nextInt();
			int[][] pascal = new int[N][N];
			
			for(int j =0;j<N;j++) {
				for(int k = 0; k<=j;k++) {
					if(k==0) {
						pascal[j][k] = 1;
						
					}else if(j==k) {
						pascal[j][k] = 1;
					}else {
						pascal[j][k] = pascal[j-1][k] + pascal[j-1][k-1];
					
					}
						
				}
					
			}
				
				System.out.println("#"+ T);
				
				for(int j =0;j<N;j++) {
					for(int k = 0; k<=j;k++) {
						System.out.print(pascal[j][k] + " ");
							
					}
					System.out.println();
				}
				
			}
			
			
		}
		
	}

