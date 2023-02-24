package D2;

import java.util.Scanner;

public class swea1974_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int[][] map = new int[9][9];
			boolean sign=true;
			
			
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0;i<9;i++) {
				int[] arr = new int[9];
				for(int j=0;j<9;j++) {
					arr[(map[i][j]-1)]++;
					
				}
				for(int a=0;a<9;a++) {
					if(arr[a]==0) {
						sign= false;
						break;
					}
				}
			}
			
			for(int i=0;i<9;i++) {
				int[] arr = new int[9];
				for(int j=0;j<9;j++) {
					arr[(map[j][i]-1)]++;
					
				}
				for(int a=0;a<9;a++) {
					if(arr[a]==0) {
						sign= false;
						break;
					}
				}
			}
			
			for(int i=0;i<=6;i+=3) {
				for(int j=0;j<=6;j+=3) {
					int[] arr = new int[9];
					
					for(int a=i;a<i+3;a++) {
						for(int b=j;b<j+3;j++) {
							arr[(map[a][b]-1)]++;
						}
						
					}
					for(int z=0;z<9;z++) {
						if(arr[z]==0) {
							sign= false;
							break;
						}
					}
				}
				
			}
			
			
			
			
			if(sign==true)		{	System.out.println("#"+(test_case)+" "+1);}
			else	{System.out.println("#"+(test_case)+" "+0);}

		}
	}

}
