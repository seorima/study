import java.util.Scanner;

public class swea1954 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			int n= sc.nextInt();
			int[][] arr = new int[n][n];
			int num=1;
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					arr[i][j]=num;
					num++;
				}
			}			
			
			
			System.out.println("#"+(test_case)+" ");
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(arr[i][j]+ " ");
				}
				System.out.println();
			}		
			
		}
	}

}
