package D2;

import java.util.Scanner;

public class swea1974 {
	
	public int sudoku() {
		Scanner sc = new Scanner(System.in);
		int result = 1;
		int cnt=0;
		
		int[][] arr = new int[9][9];
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int a=0;a<9;a++) {
			int k=0;
			for(int b=k;b<9;b++) {
				if(arr[a][k]==arr[a][b] || arr[k][a]==arr[b][a]) {
					result =0;
					return result;
					
				}
				else k++;
				
				
			}
		}
		
		for(int c=0;c<9;c+=3) {
			for(int d=0;d<9;d+=3) {
		
			for(int x=c;x<2;x++) {
				for(int y=d;y<2;y++) {
					
					if(arr[c][d]==arr[x][y]) {
						result =0;
						return result;
						
					}
					else return 0;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		
		int[] num = {1,2,3,4,5,6,7,8,9};
		
		
		
		
		
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			swea1974 C = new swea1974();
			
			
			System.out.println(C.sudoku());
			
			
			
		
			//System.out.println("#"+(test_case)+" "+result);

		}

	}

}
