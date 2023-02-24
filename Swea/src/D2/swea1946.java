package D2;

import java.util.Scanner;

public class swea1946 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n= sc.nextInt();
			String[][] arr = new String[n][10];
			
			for(int i=0;i<n;i++) {
				int num=0,cnt=0;
				int top=10;
				String str = "";
				
				str = sc.next();
				num=sc.nextInt();
				
				
				for(int j=0;j<top;j++) {
					arr[cnt][j]=str;
					top--;
					num--;
					
				}
				if(top==0) {
				cnt++;
				top=10;
				}
				if(top>0) {
					for(int z=1-top;z<10;z++) {
						arr[cnt][z]=str;
					}
				}
				if(num>0)
				{
					for(int k=0;k<num;k++) {
						arr[cnt][top]=str;
					}
				}				
				
				
			}
			
		
			System.out.println("#"+(test_case)+" ");
			for(int a=0;a<n;a++) {
				for(int b=0;b<10;b++) {
					System.out.print(arr[a][b]);
				}
				System.out.println();

		}
	}

	}
}
