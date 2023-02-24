package D2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class swea1204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt(); 
		
		

		 
	
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			int[] arr = new int[1000];
			int[] count = new int[1000];
			int max=0;
			int idx=0;
			ArrayList<Integer> result = new ArrayList<>();
			
			
			int n=sc.nextInt();
			for(int i=0;i<1000;i++) {
				arr[i]=sc.nextInt();
				count[arr[i]]++;
			}
			
			for(int i=0;i<1000;i++) {
				
				if(max<count[i]) {
					result.add(i);
					max=count[i];
				}
				
				
			}
			
			
			int fin=Collections.max(result);
			
			
			
		
			System.out.println("#"+(test_case)+" "+fin);

		}
	}

}
