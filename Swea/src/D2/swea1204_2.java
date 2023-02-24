package D2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class swea1204_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			int num=sc.nextInt();
			int[] arr = new int[1000];
			int[] count = new int[1000];
			int cnt=0;
			int max=Integer.MIN_VALUE;
			ArrayList<Integer> idx =new ArrayList<>();
			
			for(int i=0;i<1000;i++) {
				arr[i]=sc.nextInt();
				count[arr[i]]++;
			}
			
			for(int i=0;i<1000;i++) {
				if(max<count[i]) {
					max=count[i];
					idx.add(arr[i]);
				}
				
			}
			
			
			
			
		
			System.out.println("#"+(test_case)+" "+Collections.max(idx));

		}
	}

}
