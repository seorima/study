package D2;

import java.util.Arrays;
import java.util.Scanner;

public class swea1966 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			
			int n=sc.nextInt();
			int[] arr = new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			
			
			System.out.print("#"+(test_case)+" ");
		for(int x : arr)	{
			
			System.out.print(x+ " ");
			
			}
		System.out.println();
		}
	}

}
